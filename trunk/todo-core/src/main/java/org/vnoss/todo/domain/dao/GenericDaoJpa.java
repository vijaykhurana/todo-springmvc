package org.vnoss.todo.domain.dao;

import java.util.List;

import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.orm.jpa.support.JpaDaoSupport;
import org.vnoss.todo.domain.Persistable;

/**
 * Base class of BREAD/CRUD operations using the Spring JpaTemplate. <br/>
 * For the implementation using EntityManager, see GenericManager
 * 
 * @param <MODEL>
 * @author bibo (quoc383011@gmail.com)
 * @see org.appfuse.dao.jpa.GenericDaoJpa
 */
public class GenericDaoJpa<MODEL> extends JpaDaoSupport implements GenericDao<MODEL> {

   private final Class<MODEL> persistentClass;

   public GenericDaoJpa(final Class<MODEL> persistentClass) {
      this.persistentClass = persistentClass;
   }

   @SuppressWarnings("unchecked")
   public List<MODEL> findAll() {
      javax.persistence.Query jpaQuery = getJpaTemplate().getEntityManager().createQuery(
            "SELECT obj FROM " + persistentClass.getName() + " obj");
      return jpaQuery.getResultList();
   }

   public MODEL findById(final Long id) {
      MODEL result = getJpaTemplate().find(persistentClass, id);
      if (result == null) {
         throw new ObjectRetrievalFailureException(persistentClass, id);
      }
      return result;
   }

   public void remove(final Long id) {
      getJpaTemplate().remove(this.findById(id));
   }

   public void save(final MODEL object) {
      if (((Persistable) object).getId() != null) {
         getJpaTemplate().merge(object);
      }
      else {
         getJpaTemplate().persist(object);
      }
   }

}

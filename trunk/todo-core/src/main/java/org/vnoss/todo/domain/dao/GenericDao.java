package org.vnoss.todo.domain.dao;

import java.util.List;

import org.springframework.orm.ObjectRetrievalFailureException;

/**
 * Generic base class Domain Access Object
 * 
 * @param <MODEL>
 * @author bibo (quoc383011@gmail.com)
 * @see org.appfuse.dao.GenericDao
 */
public interface GenericDao<MODEL> {

   /**
    * Looks up and returns all objects of Generic type MODEL
    * 
    * @return list of Objects of type MODEL
    */
   List<MODEL> findAll();

   /**
    * Looks up and returns the object of Generic type MODEL identified by the
    * primary key provided
    * 
    * @param id
    *           the primary key of the object to find.
    * @return the Object of type MODEL uniquely identified by the id.
    * @throws ObjectRetrievalFailureException
    *            if their is no domain object with the id provided.
    */
   MODEL findById(Long id);

   /**
    * Generic method to save an object.
    * 
    * @param object
    *           the object to save
    */
   void save(MODEL object);

   /**
    * Generic method to delete an object based on class and id
    * 
    * @param id
    *           the identifier (primary key) of the object to remove
    */
   void remove(Long id);

}

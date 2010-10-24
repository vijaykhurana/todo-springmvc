package org.vnoss.todo.domain.dao;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.vnoss.todo.domain.TodoList;

@Repository("todoItemDao")
public class TodoListDaoJpa extends GenericDaoJpa<TodoList> implements TodoListDao {

   @Autowired
   public TodoListDaoJpa(final EntityManagerFactory entityManagerFactory) {
      super(TodoList.class);
      super.setEntityManagerFactory(entityManagerFactory);
   }

   public boolean exists(Long id) {
      TodoList result = getJpaTemplate().find(TodoList.class, id);
      return (result != null);
   }

}

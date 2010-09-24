package org.vnoss.todo.domain.dao;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.vnoss.todo.domain.TodoItem;

@Repository("todoItemDao")
public class TodoItemDaoJpa extends GenericDaoJpa<TodoItem> implements TodoItemDao {

   @Autowired
   public TodoItemDaoJpa(final EntityManagerFactory entityManagerFactory) {
      super(TodoItem.class);
      super.setEntityManagerFactory(entityManagerFactory);
   }

   public boolean exists(Long id) {
      TodoItem result = getJpaTemplate().find(TodoItem.class, id);
      return (result != null);
   }

}

package org.vnoss.todo.domain.dao;

import org.vnoss.todo.domain.TodoList;

public interface TodoListDao extends GenericDao<TodoList> {

   boolean exists(Long id);

}

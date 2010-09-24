package org.vnoss.todo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vnoss.todo.domain.TodoItem;
import org.vnoss.todo.domain.dao.TodoItemDao;
import org.vnoss.todo.service.dto.TodoItemDto;

import com.googlecode.simpleobjectassembler.ObjectAssembler;

@Service("todoItemManager")
@Transactional
public class TodoItemManagerImpl implements TodoItemManager {

   private ObjectAssembler objectAssembler;

   private TodoItemDao todoItemDao;

   @Autowired
   public TodoItemManagerImpl(@Qualifier("objectAssembler") ObjectAssembler objectAssembler,
         @Qualifier("todoItemDao") TodoItemDao todoItemDao) {
      this.objectAssembler = objectAssembler;
      this.todoItemDao = todoItemDao;
   }

   //
   // BREADS
   //
   public List<TodoItemDto> browse() {
      List<TodoItem> todoItems = todoItemDao.findAll();

      List<TodoItemDto> dtos = new ArrayList<TodoItemDto>();
      for (TodoItem todoItem : todoItems) {
         dtos.add(objectAssembler.assemble(todoItem, TodoItemDto.class));
      }
      return dtos;
   }

   public Long retrieve(TodoItemDto todoItem) {
      return null;
   }

   public Long edit(TodoItemDto todoItem) {
      return null;
   }

   public Long add(TodoItemDto todoItem) {
      return null;
   }

   public Long delete(TodoItemDto todoItem) {
      return null;
   }

   public List<TodoItemDto> search() {
      return null;
   }

   //
   // MORE BUSINESS
   //

}

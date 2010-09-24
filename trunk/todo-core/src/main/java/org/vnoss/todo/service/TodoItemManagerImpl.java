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
   @Transactional(readOnly=true)
   public List<TodoItemDto> browse() {
      List<TodoItem> domainItems = todoItemDao.findAll();

      List<TodoItemDto> dtos = new ArrayList<TodoItemDto>();
      for (TodoItem domain : domainItems) {
         dtos.add(objectAssembler.assemble(domain, TodoItemDto.class));
      }
      return dtos;
   }

   @Transactional(readOnly=true)
   public TodoItemDto retrieve(Long id) {
      TodoItem domain = todoItemDao.findById(id);
      TodoItemDto dto = objectAssembler.assemble(domain, TodoItemDto.class);
      return dto;
   }

   public Long edit(TodoItemDto todoItem) {
      TodoItem domain = objectAssembler.assemble(todoItem, TodoItem.class);
      todoItemDao.save(domain);
      return domain.getId();
   }

   public Long add(TodoItemDto todoItem) {
      TodoItem domain = objectAssembler.assemble(todoItem, TodoItem.class);
      todoItemDao.save(domain);
      return domain.getId();
   }

   public Long delete(Long id) {
      if (todoItemDao.exists(id) == false) {
         return null;
      }
      todoItemDao.remove(id);
      return id;
   }

   @Transactional(readOnly=true)
   public List<TodoItemDto> search() {
      List<TodoItem> domainItems = todoItemDao.findAll();

      List<TodoItemDto> dtos = new ArrayList<TodoItemDto>();
      for (TodoItem domain : domainItems) {
         dtos.add(objectAssembler.assemble(domain, TodoItemDto.class));
      }
      return dtos;
   }

   //
   // MORE BUSINESS
   //

}

package org.vnoss.todo.service;

import java.util.List;

import org.vnoss.todo.service.dto.TodoItemDto;

/**
 * Business logic for BREADS and some more operations on TodoItem (DTOs).
 * <br/>
 * BREAD (Browse/Retrieve/Edit/Add/Delete) not CRUD (Create/Read/Update/Delete),
 * because those BREAD operations cover more of what CRUD do in common. Besides,
 * the word "bread" is more sensible, and sounds more fulfilling than "crud" ! 
 * 
 * @author bibo (quoc383011@gmail.com)
 * @see org.appfuse.service.GenericManager
 */
public interface TodoItemManager {

   //
   // BREAD - not CRUD
   //
   /**
    * Browses the items.
    */
   List<TodoItemDto> browse();

   /**
    * Retrieves the item.
    * 
    * @param todoItem
    * @return
    */
   Long retrieve(TodoItemDto todoItem);

   /**
    * Edits the item.
    * 
    * @param todoItem
    * @return
    */
   Long edit(TodoItemDto todoItem);

   /**
    * Adds the item.
    * 
    * @param todoItem
    * @return
    */
   Long add(TodoItemDto todoItem);

   /**
    * Deletes the item.
    * 
    * @param todoItem
    * @return
    */
   Long delete(TodoItemDto todoItem);

   // BREADS is better than BREAD, right ;) ? 
   List<TodoItemDto> search();

   //
   // MORE BUSINESS
   //
   
}

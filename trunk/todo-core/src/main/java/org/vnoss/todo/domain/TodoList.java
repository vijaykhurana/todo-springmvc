package org.vnoss.todo.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo_list")
public class TodoList implements Persistable {

   private static final long serialVersionUID = 7038633221614617832L;

   @Id
   @Column(name = "todo_list_id")
   private Long id;

   @Column(name = "name")
   private String name;

   private Set<TodoItem> items;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String title) {
      this.name = title;
   }

   public List<TodoItem> getItems() {
      return new ArrayList<TodoItem>(items);
   }

   public void setItems(List<TodoItem> items) {
      this.items.clear();
      this.items.addAll(items);
   }

}

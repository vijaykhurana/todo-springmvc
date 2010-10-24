package org.vnoss.todo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo_item")
public class TodoItem implements Persistable {

   private static final long serialVersionUID = -1908998671749898606L;

   @Id
   @Column(name = "todo_item_id")
   private Long id;

   @Column(name = "title")
   private String title;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

}

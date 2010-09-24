package org.vnoss.todo.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TodoItemTest {

   TodoItem underTest;

   @Before
   public void setUp() {
      underTest = new TodoItem();
   }

   @Test
   public void testSetterGetterId() {
      underTest.setId(99l);
      assertEquals(99l, underTest.getId());
   }

   @Test
   public void testSetterGetterTitle() {
      underTest.setTitle("99l");
      assertEquals("99l", underTest.getTitle());
   }

}

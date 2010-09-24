package org.vnoss.todo.service.dto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TodoItemDtoTest {

   TodoItemDto underTest;

   @Before
   public void setUp() {
      underTest = new TodoItemDto();
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

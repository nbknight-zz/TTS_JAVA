package tddList;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class CustomListTest {

	  @Test
	     public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
	         List<Object> list = new CustomList<>();
	    
	         assertTrue(list.isEmpty());
	     }
	     
	     @Test
	     public void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned() {
	         List<Object> list = new CustomList<>();
	         list.add(null);
	      
	         assertFalse(list.isEmpty());
	     }
	     
	     @Test
	     public void givenListWithAnElement_whenSize_thenOneIsReturned() {
	         List<Object> list = new CustomList<>();
	         list.add(null);
	      
	         assertEquals(1, list.size());
	     }
	     
	 	@Test
		public void givenListWithAnElement_whenGet_thenThatElementIsReturned() {
		    List<Object> list = new CustomList<>();
		    list.add("baeldung");
		    list.add(".com");
		    Object element = list.get(0);
		    Object element2 = list.get(1);
		 
		    assertEquals("baeldung", element);
		    assertEquals(".com", element2);
		}
	 	
	 	@Test
	 	public void givenEmptyList_whenElementIsAdded_thenGetReturnsThatElement() {
	 	    List<Object> list = new CustomList<>();
	 	    boolean succeeded = list.add(null);
	 	 
	 	    assertTrue(succeeded);
	 	}
}

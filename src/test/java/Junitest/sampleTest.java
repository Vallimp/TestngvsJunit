package Junitest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class sampleTest {
//	public void testSample() {
//		int a=10;
//		assertTrue(a>5);
//	}

//	@TestMethodOrder(MethodOrderer.Alphanumeric)
//	
//    
//    public void StringtoInt() {
//        assertTrue(
//          Integer.valueOf("10") instanceof Integer);
//	}
//        @Test
//        public void InttoString() {
//            assertTrue(
//              String.valueOf(10) instanceof String);
//    }
//        
//        @ParameterizedTest
//        @ValueSource(strings = { "Hello", "World" })
//        @DisplayName("Test Method to check if the custom name is displayed")
//        void String_test(String word) {
//            assertNotNull(word);
//        }
	
//	@Test(timeout = 1000)
//	  public void TestFailedAsExceutionTimeisMore() {
//	      while (true);
//	  }
	//ignore test annotation
	   String message = "Numpy";	
	   sampleTest ST = new sampleTest();
	   
	   public String printMessage(){
		      System.out.println(message);
		      return message;
		   }   

		   public String AddressingMessage(){
		      message = "Hi!" + message;
		      System.out.println(message);
		      return message;
		   }   
	   @Ignore
	   @Test
	   public void testPrintMessage() {
	      System.out.println("Display Message()");
	      message = "Numpy";
	      assertEquals(message,ST.printMessage());
	   }

	   @Test
	   public void testAddressingMessage() {
	      System.out.println("Addressing Message()");
	      message = "Hi!" + "Numpy";
	      assertEquals(message,ST.AddressingMessage());
	   }
	
	   
}


package TestNGtest;


import static org.testng.Assert.assertEquals;

import org.junit.Ignore;
import org.testng.Assert;


import org.testng.annotations.Test;

import Junitest.sampleTest;  

public class TestNGsample {
	
	@Test (dependsOnMethods = { "OpenBrowser" })
	  public void LogIn() {
		  System.out.println("This will execute second (LogIn)");
	  }

	  @Test
	  public void OpenBrowser() {
		  System.out.println("This will execute first (Open Browser)");
	  }
	  
	  @Test(timeOut = 1000)
	  public void TestFailedAsExceutionTimeisMore() {
	      while (true);
	  }
	  
	  String message = "Numpy";	
	  TestNGsample ST = new TestNGsample();
	   
	   public String printMessage(){
		      System.out.println(message);
		      return message;
		   }   

		   public String AddressingMessage(){
		      message = "Hi!" + message;
		      System.out.println(message);
		      return message;
		   }   
		   
		   
	   @Test(enabled = false)
	   
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

    


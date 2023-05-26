package Junitest;

public class ArithmeticTest {

	 private String message;

	   public ArithmeticTest(String message){
	      this.message = message; 
	   }

	   // prints the message
	   public void showMessage(){
	      System.out.println(message);
	      int a = 0;
	      int b = 1/a;
	   }   

	   // add "Hi!" to the message
	   public String addMessage(){
	      message = "Numpy " + message;
	      System.out.println(message);
	      return message;
	   }   
}

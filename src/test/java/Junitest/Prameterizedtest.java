package Junitest;

import static org.testng.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Prameterizedtest {
private int firstnumber;
private int secondnumber;
private int expectedresult;
private preparam arithmetic;

public Prameterizedtest(int firstnumber, int secondnumber, int expectedresult) {
	super();
	this.firstnumber = firstnumber;
	this.secondnumber = secondnumber;
	this.expectedresult = expectedresult;
}
@Before
public void initialize() {
	arithmetic = new preparam();
}
@Test
public void Arithmetictest() {
	System.out.println("Sum of numbers = : "+expectedresult);
	assertEquals(expectedresult, arithmetic.sum(firstnumber, secondnumber));
}

@Parameterized.Parameters
public static Collection input() {
	return Arrays.asList(new Object[][] {{1,2,3}, {11,12,23}, {111, 222, 333}, {10,9,19},{100,9,109}});
}
}
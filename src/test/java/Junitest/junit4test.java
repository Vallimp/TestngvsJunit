package Junitest;

import static org.testng.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runners.MethodSorters;

	@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
	//@TestMethodOrder(MethodOrderer.Random.class)
	public class junit4test {
		    @Test
		     public void testE() {
		        assertTrue(true);
		    }
		    
		    @Test
		    public void testA() {
		        assertTrue(true);
		    }

		    @Test
		    public void testD() {
		        assertTrue(true);
		    }

		    @Test
		    public void testC() {
		        assertTrue(true);
		    }

		    @Test
		    public void testB() {
		        assertTrue(true);
		    }
		}

	
	


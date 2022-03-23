package com.capg.beans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FactorialTest {

	Factorial factorial;
	
	@BeforeEach
	void setUp() throws Exception {
	 factorial=new Factorial();
	}

	@Test
	void testGetFactorial() {
	 assertEquals(24,factorial.getFactorial(4));
	 assertEquals(120,factorial.getFactorial(5));
	 assertEquals(720,factorial.getFactorial(6));
	 
		System.out.println("factorial of 4 is "+factorial.getFactorial(4));
		System.out.println("factorial of 5 is "+factorial.getFactorial(5));
		System.out.println("factorial of 6 is "+factorial.getFactorial(6));
	}

}

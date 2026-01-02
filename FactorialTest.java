package scd;

import static org.junit.Assert.*;

import org.junit.Test;

import lab11.NumberUtils;

public class FactorialTest {
	    NumberUtils obj = new NumberUtils();
	    @Test
	    public void testFactorial() {
	        assertEquals(120, obj.factorial(5));}}

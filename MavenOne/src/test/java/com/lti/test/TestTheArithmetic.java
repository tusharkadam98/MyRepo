package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.TheArithmetic;

public class TestTheArithmetic {

	private TheArithmetic arth;
	
	@Before
	public void init() {
		arth = new TheArithmetic();
	}
	
	@Test
	public void testAddition() {
		assertEquals(10,arth.addition(4, 6));
	}
	
}

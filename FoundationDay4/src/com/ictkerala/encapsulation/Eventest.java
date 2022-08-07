package com.ictkerala.encapsulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class Eventest {
	
	

	@Test
	public void test() {
		
		Evencla obj = new Evencla();
		
		assertTrue(obj.iseven(7));
	}

}

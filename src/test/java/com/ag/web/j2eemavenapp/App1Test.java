package com.ag.web.j2eemavenapp;

import static org.junit.Assert.*;

import org.junit.Test;


public class App1Test {

	@Test
	public void test() {
		App1 app1 = new App1();
		assertEquals("Sample",app1.Sample());
		
	}

}



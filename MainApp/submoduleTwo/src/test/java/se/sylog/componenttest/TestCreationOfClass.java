package se.sylog.componenttest;

import static org.junit.Assert.*;

import org.junit.Test;

import se.sylog.componenttest.MyPersonalPrinter;

public class TestCreationOfClass {

	@Test
	public void testMyPersonalPrinter() {
		MyPersonalPrinter one = new MyPersonalPrinter(); 
		assertNotNull(one);
	}

	@Test
	public void testToString() {
		MyPersonalPrinter one = new MyPersonalPrinter();
		assertNotEquals(one.toString(), "");
	}

}

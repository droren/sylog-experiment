package se.sylog.componenttest;

import static org.junit.Assert.*;

import org.junit.Test;

import se.sylog.componenttest.MyPersonalPrinter;

public class TestCreationOfClass {

	@Test
	public void testMyPersonalPrinter() {
		MyPersonalPrinter one = new MyPersonalPrinter(false); 
		assertNotNull(one);
	}

	@Test
	public void testToString() {
		MyPersonalPrinter one = new MyPersonalPrinter();
		assertEquals(one.toString(), "");
	}
	
	@Test
	public void testSetContents() {
		MyPersonalPrinter one = new MyPersonalPrinter();
		assertEquals(one.toString(), "");
		one.setToPrint("test-contents");
		assertEquals(one.toString(), "test-contents");
	}

	@Test
	public void testgetToPrint() {
		MyPersonalPrinter one = new MyPersonalPrinter();
		assertEquals(one.getToPrint(), "");
		one.setToPrint("test-contents");
		assertEquals(one.getToPrint(), "test-contents");
	}

}

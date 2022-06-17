package com.railways.metro.underwaterRailways;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VehicleTest {
	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("before class");
	}
	@AfterClass
	public static void afterClassMethod() {
		System.out.println("after class");
	}
	@Before
	public void before() {
		System.out.println("before method");
	}
	@After
	public void after() {
		System.out.println("after method");
	}
	@Test
	public void testPrintLength() {
		Vehicle v = new Vehicle();
		int output = v.printLength("benz");
		assertEquals(4, output);
		System.out.println("METHOD 1 IS CALLED");
	}
	@Test
	public void testM1() {
		System.out.println("METHOD 2 IS CALLED");
	}

}

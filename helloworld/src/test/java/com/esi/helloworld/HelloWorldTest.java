package com.esi.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void TestSayHello(){
		HelloWorld helloWorld=new HelloWorld();
		String r=helloWorld.sayHello();
		assertEquals(r, "hello");
	}
}

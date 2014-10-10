package com.msr.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testSayHello() throws Exception {
        assertEquals("Hello World Github",HelloWorld.sayHello("Github"));
    }
}
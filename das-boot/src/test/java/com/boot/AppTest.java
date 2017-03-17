package com.boot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.boot.controller.HomeController;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
	@Test
    public void testApp(){
		HomeController homeController = new HomeController();
		String response = homeController.home();
		assertEquals(response, "hello from spring boot! added new");
    }
}

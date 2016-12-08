package com.boot;

import com.boot.controller.HomeController;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
	
	@Test
    public void testApp()
    {
        HomeController controller = new HomeController();
        String result = controller.home();
        
        assertEquals( result , "Das Boot, reporting for duty!" );
    }
}

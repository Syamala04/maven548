package com.myproject;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.myproject548.App;

public class AppTest {
	
	@Test
	public void testlogin1()
	{
		App myapp = new App();
		Assert.assertEquals(0,myapp.userLogin("cse","cse2024"));
	}
	
	@Test
	public void testlogin2()
	{
		App myapp = new App();
		Assert.assertEquals(0,myapp.userLogin("cse","cse@2024"));
	}

}

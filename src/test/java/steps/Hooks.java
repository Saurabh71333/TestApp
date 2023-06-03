package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	@BeforeAll
	public static void DBConnectionsetup() {
		
		System.out.println("Before all do DB connection");
		
	}
	@AfterAll
	public static void DBConnectionClose() {
		
		System.out.println("after all scenario close DB connection");
		
	}
	
	
	
	
	@Before("@prodnew")
	public void setup() {
		
		System.out.println("Launch browser");
		
	}
	
	
	
	@After
	public void teardown() {
		
		System.out.println("Close browser");
		
	}
	
	
	/*
	 * @BeforeStep public void logger() {
	 * System.out.println("Logs after every step executed"); }
	 */
}

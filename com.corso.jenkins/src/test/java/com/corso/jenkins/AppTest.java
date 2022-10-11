package com.corso.jenkins;

 
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

		public App app;
		
		
		@BeforeEach
		public void setUp() {
			app = new App();
		}
		
		
		@Test
		@DisplayName("Play per number = 1")
		public void testNumber1() {
			String test = app.play(1);
			Assertions.assertEquals(test, "1");			 
		}
		

		@Test
		@DisplayName("Play per number = 3")
		public void testNumber2() {
			String test = app.play(3);
			Assertions.assertEquals(test, "Divisibile per 3");			 
		}

		
		@Test
		@DisplayName("Play per number = 5")
		public void testNumber3() {
			String test = app.play(5);
			Assertions.assertEquals(test, "Divisibile per 5");			 
		}
		
		@Test
		@DisplayName("Play per number = 0")
		public void testNumber4() {
			Assertions.assertThrows(
				IllegalArgumentException.class, 
				() -> app.play(0)
			);
						 
		}

		
		
		@AfterEach
		public void tearDown() {
			app = null;
		}
	
}

package com.sample.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleApplicationTests {

	@Test
	@DisplayName("num should be equal num2.")
	void contextLoads() {
		Integer num = 11;
		Integer num2 = 11;
 
		assertEquals(num, num2);
	}

}

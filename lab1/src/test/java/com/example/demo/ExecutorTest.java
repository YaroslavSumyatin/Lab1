package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExecutorTest extends ExecutorTestConfiguration{

	private HelloService service = new HelloService();
	
	@Test
	public void test() {
		System.out.println("executor method");
		service.sayHello();
	}
	
}

package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YamlApplicationTests {

	@Autowired
	private QueueProperties queueProperties;

	@Test
	public void contextLoads() {
		System.out.println(queueProperties);
		Assert.assertNotNull(queueProperties.getQueueConfig());
		Assert.assertNotNull(queueProperties.getQueueConfig().get("testqueue"));
	}

}

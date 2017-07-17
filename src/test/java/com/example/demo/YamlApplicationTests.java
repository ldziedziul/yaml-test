package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.*;

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
		Assert.assertThat(queueProperties.getQueueConfig().get("testqueue").get("x-message-ttl"), is(0));
		Assert.assertThat(queueProperties.getQueueConfig().get("default").get("x-message-ttl"), is(28800000));
	}

}

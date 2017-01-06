package com.example.spring.retry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.spring.retry.service.RemoteService;

@RunWith(SpringRunner.class)
@ContextConfiguration({ "/spring-retry.xml" })
public class RemoteServiceTest {
	@Autowired
	private RemoteService remoteService;

	@Test
	public void testDosomething()  throws Exception {
		remoteService.dosomething();
	}
	
}

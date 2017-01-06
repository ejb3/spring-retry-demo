package com.example.spring.retry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;

import com.example.spring.retry.service.RemoteService;

@Configuration
@EnableRetry
public class Application {
	@Bean
    public RemoteService remoteService() {
		
        return new RemoteService();
    }
}

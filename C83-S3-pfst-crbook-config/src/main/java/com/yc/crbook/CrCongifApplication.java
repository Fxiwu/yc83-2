package com.yc.crbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
 import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 
@SpringBootApplication
 
 
//服务降级注解
@EnableCircuitBreaker
public class CrCongifApplication implements WebMvcConfigurer{
	 

		public static void main(String[] args) {
			SpringApplication.run(CrCongifApplication.class, args);
		}
		
		
		@LoadBalanced
		@Bean //定义RestTemplate Bean
		public RestTemplate getRestTemplate() {
			return new RestTemplate();
		}
}

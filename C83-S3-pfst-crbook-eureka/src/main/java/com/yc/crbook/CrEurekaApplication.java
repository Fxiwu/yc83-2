package com.yc.crbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 
@EnableEurekaServer
@SpringBootApplication
 
public class CrEurekaApplication implements WebMvcConfigurer {
	 

		public static void main(String[] args) {
			SpringApplication.run(CrEurekaApplication.class, args);
		}
		
		
		@LoadBalanced
		@Bean //定义RestTemplate Bean
		public RestTemplate getRestTemplate() {
			return new RestTemplate();
		}
}

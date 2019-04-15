package com.gmail.janandith.dummyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class DummyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyServiceApplication.class, args);
	}

	@Bean // spring cloud sleuth
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}
}

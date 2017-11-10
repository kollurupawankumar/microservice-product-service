package com.pawan.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
//@EnableDiscoveryClient
/**
 * The annotation of discovery client will make sure it gets registered
 * with Eureka server and gives the heart beat at certain interval for the 
 * Server. If it is not available it will throw error.
 * @author pawank
 *
 */
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

}

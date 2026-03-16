package com.restaurant.menuservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestaurantMenuServiceApplication {

	public static void main(String[] args) {

        SpringApplication.run(RestaurantMenuServiceApplication.class, args);
        System.out.println("Jay Shree Ram - 6");
	}

}

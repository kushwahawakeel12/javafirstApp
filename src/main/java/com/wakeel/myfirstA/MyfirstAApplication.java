package com.wakeel.myfirstA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstAApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstAApplication.class, args);
		System.out.println("Hello world how are you ");
		int a =10;
		int b = 20;
		if(a==b)
		{
			System.out.println("it is true");
		}
		else 
		{
			System.out.println("it is false");
		}
		
		
	}

}

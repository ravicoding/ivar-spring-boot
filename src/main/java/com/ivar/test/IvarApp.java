package com.ivar.test;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */


@SpringBootApplication
public class IvarApp 
{
	
	    public static void main(String[] args) throws Exception {
	    	System.out.println("   ---------MAIN----------    ");	  	 
	    	ApplicationContext ctx = SpringApplication.run(IvarApp.class, args);
	        System.out.println("  ----- BEFORE ---------");
	        String[] beanNames = ctx.getBeanDefinitionNames();
	        Arrays.sort(beanNames);
	        for (String beanName : beanNames) {
	            System.out.println(beanName);
	        }
	      //  demo(repository);
	    }	    
	  
}

package com.ivar.test.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ivar.test.domain.Activity;
import com.ivar.test.domain.ActivityRepository;

@RestController
@RequestMapping("/ivar")
public class IvarService {

	@Autowired
	ActivityRepository activityRepository;
	  
	   @ResponseBody
	   @RequestMapping("/home")
	   public String welcome() {
		  List<Activity> list = activityRepository.findAll();
		  System.out.println(list.size());
	        return "IVAR Sample Spring Boot";
	   }
}

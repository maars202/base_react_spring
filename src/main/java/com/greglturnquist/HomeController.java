package com.greglturnquist;


// annotations:
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



// 1	@Controller marks this class as a Spring MVC controller.
// 2	@RequestMapping flags the index() method to support the / route.
// 3	It returns index as the name of the template, which Spring Boot’s autoconfigured view resolver 
// will map to src/main/resources/templates/index.html.
// SO need to add pages!!!


@Controller //(1)
public class HomeController {

	@RequestMapping(value = "/") //(2)
	public String index() {
		return "index"; //(3)
	}

}
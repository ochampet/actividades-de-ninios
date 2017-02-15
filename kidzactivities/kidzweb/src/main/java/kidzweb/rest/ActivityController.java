package kidzweb.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class ActivityController {

	@RequestMapping("/")
	@ResponseBody
	public String Activity() {
		return "You got to activities!";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ActivityController.class, args);

	}

}

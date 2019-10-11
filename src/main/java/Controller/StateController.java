package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@GetMapping("/all") 
	public String getAllStates() {
		jdbcTemplate.getClass();
		return "success";
		
	}
}

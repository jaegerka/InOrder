package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

	@GetMapping("/all") 
	public String getAllStates() {
		return null;
		
	}
}

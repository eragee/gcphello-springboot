package info.xyzxyz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public RestResponse HelloWorld() {
		return new RestResponse("Hello World");
	}

}

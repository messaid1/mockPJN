package com.mock.mockPJN;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpNotFoundController {
    // private static final String template = "Hello, %s!";
	// private final AtomicLong counter = new AtomicLong();

	@GetMapping("/HttpNotFound/*")
	public ResponseEntity<HttpNotFound> httpNotFound(@RequestParam(value = "name", defaultValue = "World") String name) {
		return ResponseEntity.notFound().build();
	}

}

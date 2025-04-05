package com.autolibre.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
		// Aplicacion siempre para obtener respuesta desde el front
		@CrossOrigin(origins = "http://localhost:5173")
		@GetMapping("/api/message")
		public String getMessage() {
			return "Hola desde el backend";
		}
}

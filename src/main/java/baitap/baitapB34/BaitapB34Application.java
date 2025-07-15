package baitap.baitapB34;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaitapB34Application {

	public static void main(String[] args) {
		SpringApplication.run(BaitapB34Application.class, args);
	}
	// Postman
	// 1: GET http://localhost:8080/greet?name=John
	// 2: GET http://localhost:8080/time
	// 3: GET http://localhost:8080/sum
	// 4: GET http://localhost:8080/calc/(add/subtract/multiply/divide)
	// 5: GET http://localhost:8080/welcome/(Brian?lang=en/Lan?lang=vi)
}

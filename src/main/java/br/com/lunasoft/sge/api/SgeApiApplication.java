package br.com.lunasoft.sge.api;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SgeApiApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SgeApiApplication.class, args);
	}

}

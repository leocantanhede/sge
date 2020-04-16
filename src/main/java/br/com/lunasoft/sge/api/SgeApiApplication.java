package br.com.lunasoft.sge.api;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SgeApiApplication {

	public static void main(String[] args) throws IOException {
		Map<String, Object> map = new HashMap<>();
		String path = new File(".").getCanonicalPath();
		
		map.put("spring.datasource.url", "jdbc:h2:file:" + path + File.separator + "SGE;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
		map.put("logging.file", path + File.separator + "sge-api.log");
		
		SpringApplication application = new SpringApplication(SgeApiApplication.class);
		application.setDefaultProperties(map);
		application.run(args);
	}

}

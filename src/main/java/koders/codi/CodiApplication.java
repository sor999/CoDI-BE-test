package koders.codi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CodiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodiApplication.class, args);
	}

}

package pe.edu.galaxy.training.java.ms.gestion.citamedica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsGestionCitaMedicaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGestionCitaMedicaConsumerApplication.class, args);
	}
}

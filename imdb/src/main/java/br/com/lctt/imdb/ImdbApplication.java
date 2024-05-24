package br.com.lctt.imdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ImdbApplication {

	public static void main(String[] args) {

		SpringApplication.run(ImdbApplication.class, args);

		testaChamada();


	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	private static void testaChamada() {
		RestTemplate restTemplate =new RestTemplate();
		Object obj = restTemplate.getForObject("https://api.themoviedb.org/3/movie/11?api_key=myApiKey", Object.class);
		System.out.println(obj.toString());
	}

}

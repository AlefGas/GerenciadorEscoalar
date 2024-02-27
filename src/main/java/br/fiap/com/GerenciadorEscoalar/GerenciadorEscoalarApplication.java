package br.fiap.com.GerenciadorEscoalar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class GerenciadorEscoalarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorEscoalarApplication.class, args);
	}
	@RequestMapping()
	@ResponseBody
	public String home (){
		return "Alef";
	}
}

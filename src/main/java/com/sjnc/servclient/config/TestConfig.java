package com.sjnc.servclient.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sjnc.servclient.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	// intanciando o db service
	@Autowired
	private DBService dbService;
	
	//método para chamar o DBService de forma a instanciar o banco de dados para teste, necessita da anotation @bean
	@Bean
	public void instanciaDB() {
		this.dbService.instanciaDB();
	}
}

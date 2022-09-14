package com.sjnc.servclient.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sjnc.servclient.services.DBService;

@Configuration
@Profile("dev")
public class DevConfig {

	// intanciando o db service
	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String value;
	//método para chamar o DBService de forma a instanciar o banco de dados para teste, necessita da anotation @bean
	@Bean
	public boolean instanciaDB() {
		if(value.equals("create")) {
			this.dbService.instanciaDB();
		}
		return false;
	}
}

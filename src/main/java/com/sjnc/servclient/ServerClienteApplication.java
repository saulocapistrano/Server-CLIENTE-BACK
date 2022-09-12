package com.sjnc.servclient;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sjnc.servclient.domain.Chamado;
import com.sjnc.servclient.domain.Cliente;
import com.sjnc.servclient.domain.Tecnico;
import com.sjnc.servclient.domain.enums.Perfil;
import com.sjnc.servclient.domain.enums.Prioridade;
import com.sjnc.servclient.domain.enums.Status;
import com.sjnc.servclient.repositories.ChamadoRepository;
import com.sjnc.servclient.repositories.ClienteRepository;
import com.sjnc.servclient.repositories.TecnicoRepository;

@SpringBootApplication
public class ServerClienteApplication  implements CommandLineRunner {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ServerClienteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Saulo ", "15293343572", "saulo@email.com", "123");
		tec1.addPerfis(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "56468482100", "linos@email.com", "123");
		// como o perfil de cliente é gerado em qualquer instância, então não é preciso indicar isso neste momento
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
	
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

	
	
}

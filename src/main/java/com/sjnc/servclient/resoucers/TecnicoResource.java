package com.sjnc.servclient.resoucers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjnc.servclient.domain.Tecnico;
import com.sjnc.servclient.services.TecnicoService;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResource {
	//localhots:8080/tecnicos/1 quando a requisição for get neste endpoint é o método abaixo que será chamado
	
	@Autowired
	private TecnicoService service;
	
	@GetMapping(value= "/{id}")// essa é uma variável de path, deve então ser informada no finsById
	public ResponseEntity<Tecnico> findById(@PathVariable Integer id){
		Tecnico obj = this.service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}

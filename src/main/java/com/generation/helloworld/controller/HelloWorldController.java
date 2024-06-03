package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("bsm")
	public String bsmGeneration (){
		return "Competências comportamentais: \nComunicação \nProatividade \nOrientação ao Detalhe \nTrabalho em Equipe. \nMentalidades: \nMentalidade de Crescimento \nOrientação ao Futuro \nResponsabilidade Pessoal \nPersistência";
	}
	
	@GetMapping("objetivos")
	public String objetivosSemana (){
		return "Objetivos: Revisão de SQL, revisar meus codigos para melhor compreensão do conteudo, Atualizar curriculo com boas práticas aprendidas em aula.";
	}
	
}


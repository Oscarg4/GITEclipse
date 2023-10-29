package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

public class InicioController {

	@GetMapping(value = "inicio", produces = MediaType.TEXT_PLAIN_VALUE)

	public String PaginaInicio() 

	{

		return "About us    Contacto    Iniciar sesion";

	}

}































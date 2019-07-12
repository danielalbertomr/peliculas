package com.sopra.pelicula.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ejercicioPeliculaModelo.Pelicula;

@Controller
@Scope("request")
public class ControladorDePeliculas {

	//@Autowired
	//private GestorPeliculas gestor;

	
	@RequestMapping("home")
	public ModelAndView verFormulario() {
		return new ModelAndView("formularioSpringMVC");
	}
	
	@RequestMapping("muestramelon")
	public ModelAndView muestramelon(
			@RequestParam("identificador") Integer identificador,
			@RequestParam("titulo") String titulo,
			@RequestParam("director") String director,
			@RequestParam("sinopsis") String sinopsis,
			@RequestParam("categories") List<String> categories,
			HttpServletRequest request){
		Pelicula pelicula = new Pelicula();
		pelicula.setIdentificador(identificador);
		pelicula.setTitulo(titulo);
		pelicula.setDirector(director);
		pelicula.setSinopsis(sinopsis);
		pelicula.setCategories(categories);
		
		ModelAndView modelAndView = new ModelAndView("muestraPelicula");
		
		//pasar lista de peliculas
		modelAndView.addObject("pelicula", pelicula);
		return modelAndView;
		
	}
}

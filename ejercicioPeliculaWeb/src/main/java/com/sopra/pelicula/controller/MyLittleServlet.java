package com.sopra.pelicula.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejercicioPeliculaModelo.Pelicula;
import ejercicioPeliculaNegocio.GestorPeliculas;

/**
 * Servlet implementation class MyLittleServlet
 */
@WebServlet({"/pelicula"})
public class MyLittleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyLittleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestorPeliculas gestorPelicula = new GestorPeliculas();
		List<Pelicula> peliculas = new ArrayList<>();
		String titulo = request.getParameter("titulo");
		String categories = request.getParameter("categories");// terror,drama
		Integer identificador = Integer.parseInt(request.getParameter("identificador"));
		String director = request.getParameter("director");
		String sinopsis = request.getParameter("sinopsis");
		Pelicula peli = new Pelicula(identificador, titulo, director, sinopsis, Arrays.asList(categories.split(",")));
		peliculas.add(peli);
		gestorPelicula.altaPeliculas(peliculas);
		
		request.setAttribute("pelicula",peli);
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/pelicula.jsp").forward(request, response);
	}

}

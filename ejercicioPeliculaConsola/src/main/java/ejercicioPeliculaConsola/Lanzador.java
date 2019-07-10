package ejercicioPeliculaConsola;

import java.util.ArrayList;
import java.util.List;

import ejercicioPeliculaModelo.Pelicula;
import ejercicioPeliculaNegocio.GestorPeliculas;

public class Lanzador {


	public static void main(String[] args) {
		GestorPeliculas gestorPeliculas = new GestorPeliculas();
		List<Pelicula> listaDePeliculas = new ArrayList<Pelicula>();
		List<Pelicula> peliculasACambiar = new ArrayList<Pelicula>();
		List<Integer> peliculasId = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			Pelicula pelicula = new Pelicula(i, null, null, null, null);
			listaDePeliculas.add(pelicula);
		}
		gestorPeliculas.altaPeliculas(listaDePeliculas);
		gestorPeliculas.listaPeliculas();
		System.out.println(gestorPeliculas.listaPeliculas());
		
		for(int i = 0; i < 2; i++) {
			Pelicula pelicula = new Pelicula(i, null, null, null, null);
			peliculasACambiar.add(pelicula);
		}
		gestorPeliculas.updatePelicula(peliculasACambiar);
		System.out.println(gestorPeliculas.listaPeliculas());
		
		
		for(int i = 0; i < 2; i++) {
			peliculasId.add(listaDePeliculas.get(i).getIdentificador());
		}
		gestorPeliculas.deletePelicula(peliculasId);
		gestorPeliculas.listaPeliculas();
		System.out.println(gestorPeliculas.listaPeliculas());
		System.out.println(peliculasId);
		

	}

}

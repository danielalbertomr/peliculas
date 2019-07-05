package ejercicioPeliculaConsola;

import java.util.List;

import ejercicioPeliculaModelo.Pelicula;
import ejercicioPeliculaNegocio.GestorPeliculas;

public class Lanzador {

	private static List<Pelicula> listaDePeliculas;
	private static List<Pelicula> peliculasACambiar;
	private static List<Integer> peliculasId;

	public static void main(String[] args) {
		GestorPeliculas gestorPeliculas = new GestorPeliculas();
		
		for(int i = 0; i < 10; i++) {
			Pelicula pelicula = new Pelicula(i, null, null, null, null);
			listaDePeliculas.add(pelicula);
		}
		gestorPeliculas.altaPeliculas(listaDePeliculas);
		gestorPeliculas.listaPeliculas();
		
		for(int i = 0; i < 2; i++) {
			Pelicula pelicula = new Pelicula(i, null, null, null, null);
			peliculasACambiar.add(pelicula);
		}
		gestorPeliculas.updatePelicula(peliculasACambiar);
		gestorPeliculas.listaPeliculas();
		
		for(int i = 0; i < 2; i++) {
			peliculasId.add(i);
		}
		gestorPeliculas.deletePelicula(peliculasId);
		gestorPeliculas.listaPeliculas();
		

	}

}

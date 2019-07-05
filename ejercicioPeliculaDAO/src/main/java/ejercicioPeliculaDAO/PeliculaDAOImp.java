package ejercicioPeliculaDAO;

import java.util.List;

import ejercicioPeliculaModelo.Pelicula;

public class PeliculaDAOImp implements IPeliculaDAO {
	
	private List<Pelicula> miListaDePeliculas;
	
	public void create(Pelicula pelicula) {
		if(!miListaDePeliculas.contains(pelicula)) {
			miListaDePeliculas.add(pelicula);
		}
		
	}

	public Pelicula read(Pelicula pelicula) {
		return pelicula;
	}

	public Pelicula update(Pelicula pelicula) {
		if(miListaDePeliculas.remove(pelicula)) {
			miListaDePeliculas.add(pelicula);
			return pelicula;
		}
		return null;
	}

	public void delete(Pelicula pelicula) {
		miListaDePeliculas.remove(pelicula);
	}

	public Pelicula readById(Integer id) {
		Pelicula peliculaABuscar = new Pelicula(id, "", "", "", null);
		if(miListaDePeliculas.contains(peliculaABuscar)) {
			int indexOf = miListaDePeliculas.indexOf(peliculaABuscar);
			return miListaDePeliculas.get(indexOf);
		}
		return null;
	}

	public List<Pelicula> list() {
		return miListaDePeliculas;
	}

}

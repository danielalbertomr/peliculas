package ejercicioPeliculaDAO;

import java.util.List;

import ejercicioPeliculaModelo.Pelicula;

public interface IPeliculaDAO {
	
	void create(Pelicula pelicula);
	
	Pelicula read(Pelicula pelicula);
	
	Pelicula update(Pelicula pelicula);
	
	void delete(Pelicula pelicula);
	
	Pelicula readById(Integer id);
	
	List<Pelicula> list();
	
}

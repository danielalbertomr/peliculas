package ejercicioPeliculaNegocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicioPeliculaDAO.PeliculaDAOImp;
import ejercicioPeliculaModelo.Pelicula;

@Service
public class GestorPeliculas {
	
	@Autowired
	private PeliculaDAOImp peliculaDAO;
	
	public void altaPeliculas(List<Pelicula> lista) {
		for(int i = 0; i < lista.size(); i++) {
			Pelicula pelicula = lista.get(i);
			peliculaDAO.create(pelicula);
		}
	}
	
	public List<Pelicula> listaPeliculas() {
		return peliculaDAO.list();
	}
	
	public void updatePelicula(List<Pelicula> lista) {
		for(int i = 0; i < lista.size(); i++) {
				peliculaDAO.update(lista.get(i));
		}
	}
	
	public void deletePelicula(List<Integer> lista) {
		for(int i = 0; i < lista.size(); i++) {
			Pelicula pelicula = peliculaDAO.readById(lista.get(i));
			peliculaDAO.delete(pelicula);
		}
	}
}

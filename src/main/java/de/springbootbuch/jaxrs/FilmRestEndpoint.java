package de.springbootbuch.jaxrs;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.stereotype.Component;

/**
 * Part of springbootbuch.de.
 *
 * @author Michael J. Simons
 * @author @rotnroll666
 */
@Component
@Path("/api/films")
public class FilmRestEndpoint {
	
	private final FilmService filmService;

	public FilmRestEndpoint(
		FilmService filmService
	) {
		this.filmService = filmService;
	}
	
	@GET
	public List<Film> index() {
		return filmService.getFilms();
	}
}
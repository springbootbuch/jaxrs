package de.springbootbuch.jaxrs;

import java.time.Year;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;

/**
 * Part of springbootbuch.de.
 *
 * @author Michael J. Simons
 * @author @rotnroll666
 */
@Service
public class FilmService {
	private final List<Film> films = Stream.of(
			new Film("Die Buddy Holly Story", Year.of(1978)),
			new Film("8 Mile", Year.of(2002)),
			new Film("Armageddon", Year.of(1997)),
			new Film("Bandits", Year.of(1997)),
			new Film("Walk The Line", Year.of(2005))
		)
		.sorted(Comparator.comparing(Film::getReleaseYear))
		.collect(toList());

	List<Film> getFilms() {
		return Collections.unmodifiableList(films);
	}
}
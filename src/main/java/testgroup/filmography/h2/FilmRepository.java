package testgroup.filmography.h2;

import org.springframework.data.jpa.repository.JpaRepository;
import testgroup.filmography.model.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {
}

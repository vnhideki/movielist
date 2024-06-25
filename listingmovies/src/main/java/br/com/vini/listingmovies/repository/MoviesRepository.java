package br.com.vini.listingmovies.repository;


import br.com.vini.listingmovies.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MoviesRepository extends JpaRepository<MovieEntity, Long> {

    @Query("SELECT c FROM MovieEntity c ORDER BY c.id ASC")
    List<MovieEntity> obterTodosOsFilmes();

}

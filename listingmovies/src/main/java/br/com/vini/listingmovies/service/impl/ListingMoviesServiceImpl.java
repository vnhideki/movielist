package br.com.vini.listingmovies.service.impl;

import br.com.vini.listingmovies.dto.request.AddMovieRequest;
import br.com.vini.listingmovies.dto.response.AddMovieResponse;
import br.com.vini.listingmovies.dto.response.AllMoviesResponse;
import br.com.vini.listingmovies.entity.MovieEntity;
import br.com.vini.listingmovies.repository.MoviesRepository;
import br.com.vini.listingmovies.service.IListingMoviesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ListingMoviesServiceImpl implements IListingMoviesService {
    @Autowired
    private MoviesRepository moviesRepository;

    @Override
    public AllMoviesResponse obterTodosOsFilmes(){
        AllMoviesResponse allMoviesResponse = new AllMoviesResponse();
        List<MovieEntity> movieEntity;
        movieEntity = this.moviesRepository.obterTodosOsFilmes();
        allMoviesResponse.setMovieEntityList(movieEntity);
        return allMoviesResponse;
    }

    @Override
    public AddMovieResponse adicionarFilme(AddMovieRequest add){
        AddMovieResponse addMovieResponse =  new AddMovieResponse();
        try{
            MovieEntity movieEntity = new MovieEntity(add);
            this.moviesRepository.save(movieEntity);
            addMovieResponse.setResponse("Filme adicionado com sucesso!");

        }catch(Exception e){
            log.error("Ocorreu uma execeção erro: " + e);
            addMovieResponse.setResponse("Ocorreu um erro ao salvar o filme! ");
            return addMovieResponse;
        }
        return addMovieResponse;

    }
}

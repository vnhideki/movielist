package br.com.vini.listingmovies.service;


import br.com.vini.listingmovies.dto.request.AddMovieRequest;
import br.com.vini.listingmovies.dto.response.AddMovieResponse;
import br.com.vini.listingmovies.dto.response.AllMoviesResponse;


public interface IListingMoviesService {

    AllMoviesResponse obterTodosOsFilmes();

    AddMovieResponse adicionarFilme(AddMovieRequest add);
}

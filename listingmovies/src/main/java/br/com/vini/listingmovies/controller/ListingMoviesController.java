package br.com.vini.listingmovies.controller;


import br.com.vini.listingmovies.dto.request.AddMovieRequest;
import br.com.vini.listingmovies.dto.response.AddMovieResponse;
import br.com.vini.listingmovies.dto.response.AllMoviesResponse;
import br.com.vini.listingmovies.service.IListingMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/api/v1")
public class ListingMoviesController {

    @Autowired
    private IListingMoviesService listingMoviesService;


    @GetMapping(value = "/getAllMovies")
    public ResponseEntity<AllMoviesResponse> obterTodosOsFilmes() {
        AllMoviesResponse response = listingMoviesService.obterTodosOsFilmes();
        return ResponseEntity.ok(response);
    }

    @PostMapping(value = "/addMovies")
    public ResponseEntity<AddMovieResponse> adicionarFilmes(@RequestBody AddMovieRequest add) {
        AddMovieResponse response = listingMoviesService.adicionarFilme(add);
        return ResponseEntity.ok(response);
    }
}

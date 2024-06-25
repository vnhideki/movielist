package br.com.vini.listingmovies.entity;

import br.com.vini.listingmovies.dto.request.AddMovieRequest;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "VINIMOVIES")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class MovieEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MOVIE_ID")
    private Long id;

    @Column(name="MOVIE_TITLE")
    private String titulo;

    @Column(name="MOVIE_DURATION")
    private String duracao;

    @Column(name="MOVIE_RELEASE_YEAR")
    private Integer anoLancamento;

    @Column(name="MOVIE_GENRE")
    private String genero;

    @Column(name="MOVIE_AGE_RATING")
    private String classificacaoEtaria;

    @Column(name="MOVIE_SYNOPSIS")
    private String sinopse;

    @Column(name="MOVIE_AVALIATION")
    private Double avaliacao;

    @Column(name="MOVIE_POSTER_URL")
    private String urlCapaPoster;

    @Column(name="INSERT_DATE")
    private LocalDate dataAdicao;

    public MovieEntity (AddMovieRequest addMovieRequest){
        this.titulo = addMovieRequest.getTitulo();
        this.duracao = addMovieRequest.getDuracao();
        this.anoLancamento=addMovieRequest.getAnoLancamento();
        this.genero = addMovieRequest.getGenero();
        this.classificacaoEtaria = addMovieRequest.getClassificacaoEtaria();
        this.sinopse = addMovieRequest.getSinopse();
        this.avaliacao = addMovieRequest.getAvaliacao();
        this.urlCapaPoster = addMovieRequest.getUrlCapaPoster();
        this.dataAdicao = addMovieRequest.getDataAdicao();
    }

}
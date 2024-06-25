package br.com.vini.listingmovies.dto.response;

import br.com.vini.listingmovies.entity.MovieEntity;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class AllMoviesResponse {

    List<MovieEntity> movieEntityList;
}

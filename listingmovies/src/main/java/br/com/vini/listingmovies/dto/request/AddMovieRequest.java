package br.com.vini.listingmovies.dto.request;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import java.time.LocalDate;

@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class AddMovieRequest {

    private Long id;

    private String titulo;

    private String duracao;

    private Integer anoLancamento;

    private String genero;

    private String classificacaoEtaria;

    private String sinopse;

    private Double avaliacao;

    private String urlCapaPoster;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAdicao;
}

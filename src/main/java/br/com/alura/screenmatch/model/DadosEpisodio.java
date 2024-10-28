package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Title") String titulo,
                            @JsonAlias("Episode") int episodio,
                            @JsonAlias("imdbRating") String avaliacao,
                            @JsonAlias("Released") String dataDeLancamento) {
    @Override
    public String toString() {
        return
                "Título: " + titulo + " |" +
                " Episódio: " + episodio + " |" +
                " Avaliação: " + avaliacao + " |" +
                " Data de lançamento: " + dataDeLancamento + '\'' ;
    }
}

import br.com.bruno.screenmatch.calculos.CalculadoraDeTempo;
import br.com.bruno.screenmatch.calculos.FiltroRecomendacao;
import br.com.bruno.screenmatch.modelos.Epsodio;
import br.com.bruno.screenmatch.modelos.Filme;
import br.com.bruno.screenmatch.modelos.Serie;
import br.com.bruno.screenmatch.modelos.Titulo;

import java.util.ArrayList;

/*
**************************************************************************************
Pacotes são usados para agrupar classes que estão relacionadas a alguma funcionalidade
Como a classe Filmes está em outro pacote eu tornei os métodos Public
**************************************************************************************
 */
public class Main {
    public static void main(String[] args) {
        Titulo titulo = new Titulo();
        Filme filme = new Filme();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        System.out.println("*******************\n" +
                "Filme\n" +
                "*******************");
        filme.avalia(8);
        filme.avalia(9);
        filme.avalia(10);

        filme.setNome("Rambo");
        filme.setAnoLancamento("1982");
        filme.setDuracaoEmMinutos(110);
        calculadora.inclui(filme);

        Filme filme2 = new Filme();
        filme2.setDuracaoEmMinutos(200);
        filme2.setNome("Avatar");
        filme2.setAnoLancamento("2001");

        Filme filme3 = new Filme();
        filme3.setNome("Vingadores");
        filme3.setAnoLancamento("2004");
        filme3.setDuracaoEmMinutos(180);

        calculadora.inclui(filme2);

        filme.exibeFichaTecnica();

        System.out.println(filme.getNome() + " tem média de avaliações " + filme.pegaMedia() +
                "\nEle teve " + filme.getTotalDasAvaliacoes() + " avaliações\n");

        filtro.filtra(filme);

        System.out.println("Todos os filmes que selecionei tem tempo total de " + calculadora.getTempoTotal());

        //criar lista de filmes
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Quantidade de itens no ArrayList é de " + listaDeFilmes.size());
        System.out.println("Primeiro filme é " + listaDeFilmes.get(0).getNome());

        System.out.println(listaDeFilmes);
        //fiz override do método toString na Classe Filmes
        System.out.println("O toString do filme " + listaDeFilmes.get(0).toString());


        System.out.println("\n*******************\n" +
                "Série\n" +
                "*******************");

        //instanciar uma série
        Serie serie = new Serie();

        serie.avalia(8);
        serie.avalia(9);
        serie.avalia(10);

        serie.setNome("House");
        serie.setAnoLancamento("2000");
        serie.setMinutosPorEpisodio(45);
        serie.setTemporadas(1);
        serie.setEpsodiosPorTemporada(6);

        calculadora.inclui(serie);

        serie.exibeFichaTecnica();

        System.out.println(serie.getNome() + " tem média de avaliações " + serie.pegaMedia() +
                "\nEle teve " + serie.getTotalDasAvaliacoes() + " avaliações");

        System.out.println("Tempo total dos títulos selecionados " + calculadora.getTempoTotal());

        System.out.println("*******************\n" +
                "Epsódio\n" +
                "*******************");
        Epsodio epsodio = new Epsodio();
        epsodio.setSerie(serie);
        System.out.println("Este epsódio pertence a série " + serie.getNome());
        epsodio.setTotalVisualizacoes(300);
        filtro.filtra(epsodio);
        System.out.println("Sua classificação é " + epsodio.getClassificacao());

    }
}
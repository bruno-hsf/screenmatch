package br.com.bruno.screenmatch.calculos;

import br.com.bruno.screenmatch.modelos.Filme;
import br.com.bruno.screenmatch.modelos.Serie;
import br.com.bruno.screenmatch.modelos.Titulo;

/*
************************************************************
Classe para calcular o tempo todal dos filmes e séries que
queremos assistir.
************************************************************
 */
public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    //sobrecarga de método para incluir série
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    //ou podemos usar polimorfismo, ou seja, um filme ou uma série é um Título

    public void inclui(Titulo t){
        System.out.println("Adicionando duração em minutos de " + t.getNome());
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

}

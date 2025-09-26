package br.com.bruno.screenmatch.principal;

import br.com.bruno.screenmatch.modelos.Filme;
import br.com.bruno.screenmatch.modelos.Serie;
import br.com.bruno.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class MainComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Rambo", "1982");
        filme1.avalia(9);
        Filme filme2 = new Filme("Avatar", "2001");
        filme2.avalia(10);
        Filme filme3 = new Filme("Vingadores", "2004");
        filme3.avalia(7);
        Serie serie = new Serie("House", "2000");

        //criar lista de filmes
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            //instanceof, ou seja, instancia de algo
            //coloquei dentro do *if* para tratar o erro se for uma série
            //Em outra ocasiao vamos melhorar isso
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println("Classificação " + filme.getClassificacao());
            }
            //casting de titulo para filme1
            //Filme filmes = (Filme) item;
            // System.out.println("Classificacao " + filmes.getClassificacao());
        }

        //ordenando lista com Collections
        /* Funciona muito bem com tipos primitivos: double, int, "String"
         * Para objetos não primitivos, tem que implementar na classe usando a interface 'Comparable'
         * */

        //testando
        ArrayList<String> listaFruta = new ArrayList<>();
        listaFruta.add("Limao");
        listaFruta.add("Abacaxi");
        listaFruta.add("Jaboticaba");

        //Observe que não precisamos fazer new Collections.sort(), pois sort() é um método estático.
        Collections.sort(listaFruta);
        System.out.println(listaFruta);

        Collections.sort(lista);
        System.out.println(lista);
    }

}

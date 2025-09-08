package br.com.bruno.screenmatch.modelos;

import br.com.bruno.screenmatch.calculos.Classificavel;

/*
**************************************************************************************
Herança: usamos extends, ou seja, a Classe Filme tem tudo o que a Classe Título tem
e também um atributo diretor com seus getters e setters.
Todos os Filmes são Títulos, mas nem todos os Títulos são filmes. Veremos que um Título
no nosso caso, também pode ser uma Série.
**************************************************************************************
 */
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;

    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    //metodo implementado da interface Classificavel
    //antes de implementar a interface
    /*public int getClassificacao() {
        return 0;
    }*/
    //após implementar a interface
    @Override
    public int getClassificacao() {
        //tive que fazer um casting para retornar um valor inteiro
        return (int) pegaMedia()/2;
    }
}

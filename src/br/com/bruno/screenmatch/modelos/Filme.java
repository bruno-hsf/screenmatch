package br.com.bruno.screenmatch.modelos;
/*
**************************************************************************************
Herança: usamos extends, ou seja, a Classe Filme tem tudo o que a Classe Título tem
e também um atributo diretor com seus getters e setters.
Todos os Filmes são Títulos, mas nem todos os Títulos são filmes. Veremos que um Título
no nosso caso, também pode ser uma Série.
**************************************************************************************
 */
public class Filme extends Titulo{
    private String diretor;

    public String getDiretor() {
        return diretor;

    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}

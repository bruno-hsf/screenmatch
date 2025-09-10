package br.com.bruno.screenmatch.calculos;
/*
********************************************************************
Classificar Epsódio, filme ou série.
Porém, não há como usar Herança - extends - mais de uma vez.
Filme e Série já herdam Título
Neste caso, usaremos a Interface
Para criar uma classe, pensamos: "É um", ou seja, o Filme é um Título
Para criar uma interface, pensamos: "Sabe fazer", ou seja, o Filme sabe Classificar
Conseguimos implementar mais de uma interface na mesma classe
********************************************************************
 */
public interface Classificavel {
    /*
    É tipo um contrato, a gente ta se comprometendo que quem utilizar o Classificavel vai precisar ter um
    getClassificacao.
     */

    //criar um objeto, ou seja, um *new* classificavel, não compila. Ele é um *contrato*
    //criar uma referencia, ou seja, uma variável do tipo classificavel é ok
    int getClassificacao();
}

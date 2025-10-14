package br.com.bruno.screenmatch.calculos;

public class FiltroRecomendacao {

    /*
    Poderia fazer
    public void filtra(Filme f) { metodo }
    mas como quero utilizar polimorfismo, segue o caso abaixo
     */
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para ver depois");
        }
    }
}

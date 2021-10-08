package com.minhaempresa.domain;

public class Lanche {

    // final pq é constante, static pq se refere a classe, nao precisa do objeto
    // nomenclatura em maiuscula com _ por convencao por ser constante
    // vir na frente de todos os atributos tbm é convencao
    private final static int TEMPO_ENTREGA_POR_QUILOMETRO = 10;



    private Double preco;

    public Double getPreco() {return preco;}
    public void setPreco(Double preco) {this.preco = preco;}

}

package com.minhaempresa.domain;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Massa extends Lanche {

    private final static int TEMPO_PREPARO = 30;
    public final static List<String> MENU_MASSAS = Arrays.asList("Macarrao", "Pizza", "Lasanha");

    private String molho;
    private String tipo;

    public void setMolho(String molho) {
        this.molho = molho;
    }
    public String getMolho() {
        return molho;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //na pratica de equals, criei so escrevendo equals e dando enter:

    @Override
    public boolean equals(Object o) {
        // verificando se o objeto recebido é igual a esta classe
        if (this == o) return true;
        // verifica se o objeto recebido é nulo ou de uma classe diferente da atual
        if (o == null || getClass() != o.getClass()) return false;

        //agora sim fazedno a comparacao criando um objeto da classe
        Massa massa = (Massa) o;
        return Objects.equals(this.molho, massa.molho) && Objects.equals(this.tipo, massa.tipo);
    }

    // no caso agora essa parte aqui é inutil:
    @Override
    public int hashCode() {
        return Objects.hash(molho, tipo);
    }
    //ate aqui gerou sozinho
}





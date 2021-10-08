package com.minhaempresa.domain;

import java.util.Arrays;
import java.util.List;

public class Bolo extends Lanche{

    private final static int TEMPO_PREPARO = 10;
    public final static List<String> MENU_BOLOS = Arrays.asList("chocolate", "baunilha", "cenoura", "milho");

    private String massa;
    private String recheio;
    private String cobertura;

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }



}

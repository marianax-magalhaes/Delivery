package com.minhaempresa.view;

import com.minhaempresa.domain.Massa;

public class PraticaEquals {
    public static void main(String[] args) {

        Massa massa1 = new Massa();
        massa1.setTipo("Macarrão");
        massa1.setMolho("Pesto");

        Massa massa2 = new Massa();
        massa2.setTipo("Macarrão");
        massa2.setMolho("Pesto");

        System.out.println(massa1 == massa2);
        System.out.println(massa1.equals(massa2));
    }
}

package com.minhaempresa.view;

import com.minhaempresa.domain.Bolo;
import com.minhaempresa.domain.Massa;
import com.minhaempresa.domain.Sanduiche;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        int opcao;

        System.out.println("Escolha uma das opcoes abaixo");
        System.out.println("1 Saunduiches");
        System.out.println("2 Massas");
        System.out.println("3 Bolos");

        //classe do java, vai escanear entradas (in) no console
        ;

        try(Scanner scanner = new Scanner(System.in)){
            opcao = scanner.nextInt();

            switch (opcao) {
                // todos os casos fazem a mesma coisa mas usando tecnicas diferentes p efeito de exemplo
                case 1: {
                    for (String ingredientes : Sanduiche.INGREDIENTES_DISPONIVEIS) {
                        System.out.println(ingredientes);
                    }
                    break;
                }
                case 2: {
                    // esse nome massa foi um nome de variavel inventado: para cada item (chamado aqui de massa), imprima
                    Massa.MENU_MASSAS.forEach(massa -> System.out.println(massa));
                    Massa.MENU_MASSAS.forEach(System.out::println);
                    break;
                }
                case 3: {
                    Bolo.MENU_BOLOS.stream().forEach(bolo -> System.out.println(bolo));
                    Bolo.MENU_BOLOS.stream().forEach(System.out::println);
                    break;
                }
            }
        } // finally: fechando o scanner, nao precisa nem escrever pq o scanner foi aberto num () do try, se tivesse fora teria q escrever
            // se tivesse o scanner acima do try{ opcao = scanner....} precisaria no fim } finally {scanner.close();}
    }


}

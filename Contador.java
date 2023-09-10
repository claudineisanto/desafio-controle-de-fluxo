package br.com.claudineialves.principal;

import br.com.claudineialves.execao.ParametrosInvalidosExeption;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        contar(parametroUm, parametroDois);
    }

    public static void contar(int parametroUm, int parametroDois) {

        for (int resultado = 1; resultado <= 18; resultado++) {
            System.out.println(resultado);
            if (parametroUm < parametroDois) {
                System.out.println(resultado);
            } else {
                throw new ParametrosInvalidosExeption("O parametro UM sempre deve ser" +
                        " maior que o parametro DOIS ");

            }
        }
    }
}

package br.projetoJavaUnidade1.projetoJavaUnidade1.menorNumeroEstruturado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero1;
        int numero2;
        int numero3;

        Scanner input = new Scanner(System.in);

        // informe os numeros
        System.out.println("Informe o primeiro número");
        numero1 = input.nextInt();

        System.out.println("Informe o segundo número");
        numero2 = input.nextInt();

        System.out.println("Informe o terceiro número");
        numero3 = input.nextInt();

        if (numero1 < numero2 && numero1 < numero3){
            System.out.println("O menor número é: " + numero1);
        }

        else if (numero1 < numero2 && numero1 == numero3){
            System.out.println("O menor número é: " + numero1);
        }

        else if (numero1 == numero2 && numero1 < numero3){
            System.out.println("O menor número é: " + numero1);
        }

        else if (numero2 < numero1 && numero2 < numero3){
            System.out.println("O menor número é: " + numero2);
        }

        else if (numero2 < numero1 && numero2 == numero3){
            System.out.println("O menor número é: " + numero2);
        }

        else if (numero3 < numero2 && numero3 < numero1){
            System.out.println("O menor número é: " + numero3);
        }

        else if (numero1 == numero2 && numero2 == numero3){
            System.out.println("Os 3 números são iguais!");
        }

    }
}

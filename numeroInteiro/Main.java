package br.projetoJavaUnidade1.projetoJavaUnidade1.numeroInteiro;
import java.util.Scanner;

/*
Desenvolva um algoritmo capaz de verificar se os números inteiros, dados como entrada, são  par ou ímpar.
*/


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Verificador num = new Verificador();

        boolean i = true;

        while(i){

            System.out.println("Digite um número inteiro: ");
            num.parouimpar(scanner.nextInt());
            }

    }
}

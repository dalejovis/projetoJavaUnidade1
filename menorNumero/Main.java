package Projeto.UserssantoIdeaProjectsUNIESP.POOsrcProjetoprojetoJavaUnidade1.menorNumero;

/*
Desenvolva um algoritmo capaz de encontrar o menor dentre 3 números inteiros quaisquer dados pelo teclado.
- Crie uma classe Calculadora que dentro dela, tenha um método que recebe 3 número e faça o que foi pedido.
*/


import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        char operator;
        int numero1, numero2, numero3;

        Scanner input = new Scanner(System.in);
        //para escolher o operador

        System.out.println("Informe um operador: +, -, *, /");
        operator = input.next().charAt(0);

        // informe os numeros
        System.out.println("Informe o primeiro número");
        numero1 = input.nextInt();

        System.out.println("Informe o segundo número");
        numero2 = input.nextInt();

        System.out.println("Informe o terceiro número");
        numero3 = input.nextInt();


    }
}

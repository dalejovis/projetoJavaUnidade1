package projetoJavaUnidade1.menorNumero;
import java.util.Scanner;
/*

Integrantes do Grupo:
- Anna Lyvia Santos de Medeiros
- João Vitor Morais Costa
- Lucas Correia Lucena de Souza Ribeiro
- Mateus Correia Pereira Gomes

Enunciado:

Desenvolva um algoritmo capaz de encontrar o menor dentre 3 números inteiros quaisquer dados pelo teclado.
- Crie uma classe Calculadora que dentro dela, tenha um método que recebe 3 número e faça o que foi pedido.
*/

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Calculadora calc = new Calculadora();


        // informando os numeros
        System.out.print("Informe o primeiro número: ");
        calc.setNumero1(input.nextInt());

        System.out.print("Informe o segundo número: ");
        calc.setNumero2(input.nextInt());

        System.out.print("Informe o terceiro número: ");
        calc.setNumero3(input.nextInt());


        calc.menornumero(calc.getNumero1(), calc.getNumero2(), calc.getNumero3());

    }
}

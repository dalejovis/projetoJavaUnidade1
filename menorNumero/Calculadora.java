//package Projeto.UserssantoIdeaProjectsUNIESP.POOsrcProjetoprojetoJavaUnidade1.menorNumero;
package br.projetoJavaUnidade1.projetoJavaUnidade1.menorNumero;

public class Calculadora {
    public void menornumero(int numero1, int numero2, int numero3) {

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

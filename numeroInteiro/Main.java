package projetoJavaUnidade1.numeroInteiro;
import java.util.Scanner;

/*
Desenvolva um algoritmo capaz de verificar se os números inteiros, dados como entrada, são  par ou ímpar.
*/


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Verificador num = new Verificador();

        num.setI(true);
        while(num.getI()){

            System.out.println("Digite um número inteiro: ");
            num.parouimpar(scanner.nextInt());
            System.out.println("Deseja continuar?\n(1) Sim, esse programa tá muito bom!\n(2) Não, chega!\n> ");
            num.setResposta(scanner.nextInt());
            num.setI(num.saida(num.getResposta()));
        }

    }
}
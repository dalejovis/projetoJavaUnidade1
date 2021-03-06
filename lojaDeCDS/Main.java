package projetoJavaUnidade1.lojaDeCDS;
import java.util.Scanner;

/*
Integrantes do Grupo:
- Anna Lyvia Santos de Medeiros
- João Vitor Morais Costa
- Lucas Correia Lucena de Souza Ribeiro
- Mateus Correia Pereira Gomes

Enunciado:

Em uma loja de CD 's existem apenas quatro tipos de preços que estão associados a cores. Assim os CD´s que ficam na loja
não são marcados por preços e sim por cores. Desenvolva um algoritmo que a partir da entrada da cor o software mostra o
preço. A loja está atualmente com a seguinte tabela de preços.
verde = 10,00
azul = 20,00
amarelo = 30,00
vermelho = 40,00

*/

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        LojaDeCDs cd = new LojaDeCDs();
        boolean i = true;

        /*O while vai ficar pedindo para informar a cor até o usuário
         informar uma cor válida.*/
        while(i){
            System.out.println("Informe a cor referente ao preço do CD: ");
            cd.informaPreco(leia.next());
            if(cd.getCor() != null){
                i = false;
            }

        }


    }
}

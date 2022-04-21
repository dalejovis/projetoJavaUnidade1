package br.projetoJavaUnidade1.projetoJavaUnidade1.numeroInteiro;

public class Verificador {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean parouimpar(int numero){

        if (numero % 2 == 0){
            System.out.println("O número informado é par!");
            return true;
        }

        else if (numero % 2 != 0){
            System.out.println("O número informado é ímpar!");
            return true;
        }

        return false;
    }



}

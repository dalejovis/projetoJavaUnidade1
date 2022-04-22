package projetoJavaUnidade1.menorNumero;

public class Calculadora {

    private int numero1;
    private int numero2;
    private int numero3;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    //Criando um parâmetro para o menor e maior número.
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

package projetoJavaUnidade1.numeroInteiro;

public class Verificador {

    private int numero;
    private int resposta;
    public boolean i;
    public boolean j;

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public boolean getI() {
        return i;
    }

    public void setI(boolean i) {
        this.i = i;
    }

    public boolean getJ() { return j; }

    public void setJ(boolean j) { this.j = j; }

    /*Criando um parâmetro para informar se o número informado
        é par ou é ímpar.*/
    public void parouimpar(int numero){

        if (numero % 2 == 0){
            System.out.println("O número informado é par!");
        }

        else if (numero % 2 != 0){
            System.out.println("O número informado é ímpar!");
        }
    }

    /*Utilizando switch para obter uma resposta e sair do while*/
    public boolean saida (int resposta){
        switch (resposta){
            case 1:
                setJ(false);
                return true;
            case 2:
                setJ(false);
                return false;
            default:
                System.out.println("Entrada Inválida!");
                setJ(true);
                return true;
        }
    }
}

package projetoJavaUnidade1.lojaDeCDS;


public class LojaDeCDs {
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //Usando switch para utilizar os cases referentes as cores e seus respectivos valores.
    public void informaPreco(String cor){
        switch (cor) {
            case "verde":
                System.out.println("O preço do cd informado é R$10,00");
                this.setCor("verde");
                break;
            case "azul":
                System.out.println("O preço do cd informado é R$20,00");
                this.setCor("azul");
                break;
            case "amarelo":
                System.out.println("O preço do cd informado é R$30,00");
                this.setCor("amarelo");
                break;
            case "vermelho":
                System.out.println("O preço do cd informado é R$40,00");
                this.setCor("vermelho");
                break;
            default:
                System.out.println("Entrada inválida!");

        }
    }


}


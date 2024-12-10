package Carro;

public class Carro {

    public double velocidade;
    public double aceleracao;
    public String marcha;
    public String modelo;

    public void ligarDesligar(String ligaDesliga) {
        if (ligaDesliga.equals("Ligar") || ligaDesliga.equals("ligar")) {
            System.out.println("Ligando...");
        } else if (ligaDesliga.equals("Desligar") || ligaDesliga.equals("desligar")) {
            System.out.println("Desligando...");
        }
    }

    public void acelerar(String aceleracao) {
        if (aceleracao.equals("Acelerar") || aceleracao.equals("acelerar")) {
            System.out.println("Acelerando...");
        } else if (aceleracao.equals("Desacelerar") || aceleracao.equals("desacelerar")) {
            System.out.println("Desacelerando...");
        }

    }

    public void marcha(String direcao) {
        if (direcao.equals("Cima") || direcao.equals("cima")) {
            System.out.println("Passando a marcha para cima...");
        }
        else if(direcao.equals("Baixo") || direcao.equals("baixo")) {
            System.out.println("Passando a marcha para baixo...");
        }

    }


    public void virar (String lado) {
        if (lado.equals("Direita") || lado.equals("direita")) {
            System.out.println("Virando à direita...");
        } else if (lado.equals("Esquerda") || lado.equals("esquerda")) {
            System.out.println("Virando à esquerda...");
        }
    }

}

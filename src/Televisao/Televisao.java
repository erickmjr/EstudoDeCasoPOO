package Televisao;

public class Televisao {
    public double polegadas;
    public int volume;
    public String marca;
    public int voltagem;
    public String canal;

    public Televisao(double polegadas, int volume, String marca, int voltagem, String canal) {
        this.polegadas = polegadas;
        this.marca = marca;
        this.volume = 5;
        this.voltagem = voltagem;
        this.canal = canal;
    }

    public void ligar(int voltagem, double polegadas) {
        double consumo = polegadas * voltagem;
        System.out.println("Consumo da televisão: " + consumo + "W");
    }

    public void desligar() {
        System.out.println("Desligando...");
    }

    public void volume(String resposta) {
        if (resposta.equals("Aumentar") || resposta.equals("aumentar")) {
            System.out.println("Aumentando volume...");
        } else if (resposta.equals("Diminuir") || resposta.equals("diminuir")) {
            System.out.println("Diminuindo volume...");
        }
    }

    public void trocarCanal(String canal) {
        if (canal.equals("Subir") || canal.equals("subir")) {
            System.out.println("Subindo canal...");
        } else if (canal.equals("Descer") || canal.equals("descer")) {
            System.out.println("Descendo canal...");
        }
    }

}

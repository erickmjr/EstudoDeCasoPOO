package Carro;

import java.util.Scanner;

public class ProgramaCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        int opcao;

        do {
            System.out.println("\nEscolha uma ação para o carro:");
            System.out.println("1 - Ligar/Desligar");
            System.out.println("2 - Acelerar/Desacelerar");
            System.out.println("3 - Trocar Marcha");
            System.out.println("4 - Virar");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    System.out.print("Digite 'Ligar' para ligar ou 'Desligar' para desligar: ");
                    String ligaDesliga = scanner.nextLine();
                    carro.ligarDesligar(ligaDesliga);
                    break;

                case 2:
                    System.out.print("Digite 'Acelerar' para acelerar ou 'Desacelerar' para desacelerar: ");
                    String acelerarDesacelerar = scanner.nextLine();
                    carro.acelerar(acelerarDesacelerar);
                    break;

                case 3:
                    System.out.print("Digite 'Cima' para passar a marcha para cima ou 'Baixo' para passar a marcha para baixo: ");
                    String direcao = scanner.nextLine();
                    carro.marcha(direcao);
                    break;

                case 4:
                    System.out.print("Digite 'Direita' para virar à direita ou 'Esquerda' para virar à esquerda: ");
                    String lado = scanner.nextLine();
                    carro.virar(lado);
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}

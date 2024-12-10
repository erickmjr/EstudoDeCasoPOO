package Televisao;

import java.util.Scanner;

public class ProgramaTV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Televisao televisao;

        System.out.println("Digite o tamanho em polegadas da televisão: ");
        double polegadas = scanner.nextDouble();
        scanner.nextLine();

        int volume;
        do {
            System.out.println("Digite o volume da televisão (de 1 a 10): ");
            volume = scanner.nextInt();
            if (volume >= 1 && volume <= 10) {
                System.out.println("Volume cadastrado.");
            } else {
                System.out.println("Valor inválido! O volume deve ser entre 1 e 10.");
            }
        } while (volume < 1 || volume > 10);

        scanner.nextLine();

        System.out.println("Informe a marca da televisão: ");
        String marca = scanner.nextLine();

        System.out.println("Informe a voltagem da televisão (110 ou 220): ");
        int voltagem = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o canal atual da televisão: ");
        String canal = scanner.nextLine();


        televisao = new Televisao(polegadas, volume, marca, voltagem, canal);

        int opcao;
        do {
            System.out.println("\nEscolha uma ação para a televisão:");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Aumentar ou diminuir volume");
            System.out.println("4 - Subir ou descer canal");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    televisao.ligar(voltagem, polegadas);
                    break;
                case 2:
                    televisao.desligar();
                    break;
                case 3:
                    System.out.print("Digite 'Aumentar' para aumentar o volume ou 'Diminuir' para diminuir: ");
                    String respostaVolume = scanner.nextLine();
                    televisao.volume(respostaVolume);
                    break;
                case 4:
                    System.out.print("Digite 'Subir' para subir o canal ou 'Descer' para descer: ");
                    String respostaCanal = scanner.nextLine();
                    televisao.trocarCanal(respostaCanal);
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

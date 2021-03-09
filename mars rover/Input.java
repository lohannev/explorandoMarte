package mars.rover;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Malha malha = null;

        while (malha == null) {
            System.out.println("Digite a extensão do planalto da malha (por exemplo: (1,4): ");
            String malhaInput = ler.next();

            try {
                malha = buildMalha(malhaInput);
            } catch (Exception e) {
                System.out.println("Formato de entrada inválido.");
            }
        }

        String posicaoInicial = " ";
        int continuar = 1;

        while (continuar != 0) {
            System.out.println("Digite a posição (x,y) e a direção (E, W, S, N) inicial da sonda: ");
            posicaoInicial = ler.next();

            // TODO: instanciar as sondas e pedir os comandos a serem usados

            System.out.println("Para encerrar, digite 0. Para continuar, digite 1: ");
            continuar = ler.nextInt();
        }

        System.out.println(posicaoInicial);
    }

    // método que faz a validação de entrada

    private static Malha buildMalha(String input) {

        if (input == null || input.isBlank() || !input.contains(",") || !input.startsWith("(") || !input.endsWith(")")) {
            throw new IllegalArgumentException();
        }

        String[] positions = input.split(",");

        if (positions.length != 2) {
            throw new IllegalArgumentException();
        }


        try {
            int x = Integer.parseInt(positions[0].replace("(", ""));
            int y = Integer.parseInt(positions[1].replace(")", ""));

            return new Malha(x, y);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}

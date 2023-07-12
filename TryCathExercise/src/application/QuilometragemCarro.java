package application;

import java.util.Scanner;

public class QuilometragemCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quilometragem inicial definida pelo administrador: ");
        int kmInicial = scanner.nextInt();

        while (true) {
            System.out.print("Insira a quilometragem atual: ");
            int kmAtual = scanner.nextInt();

            int diferenca = kmAtual - kmInicial;

            if (diferenca >= 10000) {
            	System.out.println("Muda a cor do botão");
                System.out.println("Notificação: Realizar revisão do carro.");
                System.out.print("Insira a nova quilometragem inicial: ");
                kmInicial = scanner.nextInt();
            }
        }
    }
}

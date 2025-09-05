package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] ninjas = {};
        int opcao;
        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao){
                case 1:
                    String[] copia = {};
                    System.out.print("Quantidade de ninjas a serem cadastrados: ");
                    int tamanho = entrada.nextInt();

                    int tam = ninjas.length + tamanho;
                    copia = new String[tam];

                    for (int j = 0; j < ninjas.length ; j++) {
                        copia[j] = ninjas[j];
                    }

                    entrada.nextLine();

                    for (int i = ninjas.length; i < copia.length; i++) {
                        System.out.print("Nome do ninja: ");
                        String nome = entrada.nextLine();
                        copia[i] = nome;
                    }
                    ninjas = copia;
                    System.out.println("Ninjas salvos");
                    break;
                case 2:
                    if (ninjas.length == 0){
                        System.out.println("Nenhum ninja foi cadastrado");
                    }
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println("Ninja " + (i+1) + " : " + ninjas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Fim do programa...");
                    System.out.println("----------------------");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }while(opcao != 3);
        entrada.close();
    }
}

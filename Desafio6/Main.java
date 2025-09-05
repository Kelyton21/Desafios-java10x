package Desafios.Desafio6;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        LinkedList<Ninja> listDeNinjas = new LinkedList<>();

        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Remover Ninjas");
            System.out.println("3. Listar Ninjas");
            System.out.println("4. Organizar Ninjas");
            System.out.println("5. Buscar Ninjas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            switch (opcao){
                case 1:
                    adicionaNinja(listDeNinjas);
                    break;
                case 2:
                    entrada.nextLine();
                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();
                    removeNinja(listDeNinjas,nome);
                    break;
                case 3:
                    imprimirNinjas(listDeNinjas);
                    break;
                case 4:
                    System.out.println("1. Por Nome");
                    System.out.println("2. Por Idade");
                    System.out.println("3. Por vila");
                    System.out.print("Opcao: ");
                    opcao = entrada.nextInt();
                    if (opcao == 1)
                        organizarNinjaNome(listDeNinjas);
                    else if (opcao == 2)
                        organizarNinjaIdade(listDeNinjas);
                    else if (opcao == 3)
                        organizarNinjaVila(listDeNinjas);
                    else
                        System.out.println("Opcao invalida");
                    System.out.println("Lista organizada");
                    break;
                case 5:
                    entrada.nextLine();
                    System.out.print("Nome: ");
                    nome = entrada.nextLine();
                    buscarNinja(listDeNinjas,nome);
                    break;
                case 6:
                    System.out.println("Fim do programa...");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }while (opcao != 6);
    }
    public static void adicionaNinja(LinkedList<Ninja> lista){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Vila: ");
        String vila = entrada.nextLine();

        lista.addFirst(new Ninja(nome, idade, vila));
        System.out.println("Ninja adicionado");
    }
    public static void removeNinja(LinkedList<Ninja> lista,String nome){
        Ninja ninja = lista.stream().filter(n -> n.getNome().equals(nome)).findFirst().orElse(null);
        if (ninja != null){
            lista.remove(ninja);
            System.out.println("Ninja removido");
        }
        else{
            System.out.println("Ninja não encontrado!");
        }
    }
    public static void imprimirNinjas(LinkedList<Ninja> ninjas){
        System.out.println("-------------------------");
        for(Ninja ninja: ninjas){
            System.out.println(ninja);
        }
        System.out.println("-------------------------");
    }
    public static void buscarNinja(LinkedList<Ninja> ninjas, String nome){
        Ninja ninja = ninjas.stream().filter(n -> n.getNome().equals(nome)).findFirst().orElse(null);
        if (ninja != null){
            System.out.println(ninja);
        }
        else{
            System.out.println("Ninja não encontrado!");
        }
    }
    public static void organizarNinjaNome(LinkedList<Ninja> ninjas){
        ninjas.sort(Comparator.comparing(Ninja::getNome));
    }
    public static void organizarNinjaVila(LinkedList<Ninja> ninjas){
        ninjas.sort(Comparator.comparing(Ninja::getVila));
    }
    public static void organizarNinjaIdade(LinkedList<Ninja> ninjas){
        ninjas.sort(Comparator.comparingInt(Ninja::getIdade));
    }
}

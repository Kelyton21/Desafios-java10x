package Desafios;

public class Desafio1 {
    public static void main(String[] args) {

        /*
        Use == para comparar tipos primitivos (como int, boolean, double, etc.).
        Use .equals() para comparar o conteúdo de objetos, como strings, classes personalizadas, ou qualquer outro objeto.
        */
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 14;
        String missaoNinha1 = "Fazer aquilo 1";
        char nivelMissao1 = 'C';
        String status1 = "nao concluido";

        String nomeNinja2 = "Itachi Uchiha";
        int idadeNinja2 = 15;
        String missaoNinha2 = "Fazer aquilo 2";
        char nivelMissao2 = 'D';
        String status2 = "nao concluido";

        String nomeNinja3 = "Kakashi Hatake";
        int idadeNinja3 = 19;
        String missaoNinha3 = "Fazer aquilo 3";
        char nivelMissao3 = 'A';
        String status3 = "nao concluido";

        System.out.println("Nome do ninja: " +nomeNinja1);
        System.out.println("Idade do Ninja: " +idadeNinja1);
        System.out.println("Nivel da missao: " +missaoNinha1);
        System.out.println("Nivel de dificuldade: " +nivelMissao1);
        System.out.println("Status da missao: " +status1);
        System.out.println("====================================");
        System.out.println("Nome do ninja: " +nomeNinja2);
        System.out.println("Idade do Ninja: " +idadeNinja2);
        System.out.println("Nivel da missao: " +missaoNinha2);
        System.out.println("Nivel de dificuldade: " +nivelMissao2);
        System.out.println("Status da missao: " +status2);
        System.out.println("====================================");
        System.out.println("Nome do ninja: " +nomeNinja3);
        System.out.println("Idade do Ninja: " +idadeNinja3);
        System.out.println("Nivel da missao: " +missaoNinha3);
        System.out.println("Nivel de dificuldade: " +nivelMissao3);
        System.out.println("Status da missao: " +status3);
        System.out.println("====================================");

        if (missaoNinha1.equals("D") )
        if (idadeNinja1 >= 15){
            status1 = "concluido";
            System.out.println("O ninja " + nomeNinja1 +" pode fazer a missao");
        }
        if (idadeNinja2 >= 15){
            status2 = "concluido";
            System.out.println("O ninja " + nomeNinja2 +" pode fazer a missao");
        }
        if (idadeNinja3 >= 15){
            status3 = "concluido";
            System.out.println("O ninja " + nomeNinja3 +" pode fazer a missao");
        }
    }
}

package Exercicio3;

import Exercicio2.Data;

public class VooTeste {
    public static void main(String[] args) {
        Data data = new Data(11, 9, 2003);
        Voo voo1 = new Voo(1, data);

        System.out.println("Informações do Voo 1:");
        System.out.println(voo1);

        int proximaCadeiraLivre = voo1.proximoLivre();
        System.out.println("Próxima cadeira livre: " + proximaCadeiraLivre);

        int numeroCadeira = 5;
        if (voo1.ocupa(numeroCadeira)) {
            System.out.println("Cadeira " + numeroCadeira + " ocupada com sucesso.");
        } else {
            System.out.println("Cadeira " + numeroCadeira + " não pôde ser ocupada.");
        }

        System.out.println("Cadeira 5 está ocupada? " + voo1.verifica(5));
        System.out.println("Cadeira 10 está ocupada? " + voo1.verifica(10));

        System.out.println("Número de vagas disponíveis no Voo 1: " + voo1.vagas());
    }
}
package Exercicio4;

import Exercicio2.Data;

public class VooSeparadoTest {
    public static void main(String[] args) {
        Data data = new Data(15, 11, 2023);
        VooSeparado vooSeparado = new VooSeparado(1, data, 150, 30);

        System.out.println("Informações do Voo Separado:");
        System.out.println("Número do Voo: " + vooSeparado.getNumeroVoo());
        System.out.println("Data do Voo: " + vooSeparado.getData());
        System.out.println("Máximo de Vagas: " + vooSeparado.getMaxVagas());
        System.out.println("Cadeiras para Fumantes: " + vooSeparado.getCadeirasFumantes());

        int proximaCadeiraLivre = vooSeparado.proximoLivre();
        System.out.println("Próxima cadeira livre: " + proximaCadeiraLivre);

        int numeroCadeira = 5;
        if (vooSeparado.ocupa(numeroCadeira)) {
            System.out.println("Cadeira " + numeroCadeira + " ocupada com sucesso.");
        } else {
            System.out.println("Cadeira " + numeroCadeira + " não pôde ser ocupada.");
        }

        System.out.println("Cadeira 5 está ocupada? " + vooSeparado.verifica(numeroCadeira));
        System.out.println("Cadeira 10 está ocupada? " + vooSeparado.verifica(10));

        System.out.println("Número de vagas disponíveis no Voo Separado: " + vooSeparado.vagas());

        System.out.println("Tipo da Cadeira 5: " + vooSeparado.tipo(numeroCadeira));
    }
}


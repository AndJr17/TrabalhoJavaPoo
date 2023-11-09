package Exercicio3;

import Exercicio2.Data;

public class Voo {
    private int numeroVoo;
    private Data data;
    private boolean[] ocupacao;
    private int passageirosOcupados;

    // Construtor da classe Voo
    public Voo(int numeroVoo, Data data) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        // Inicializa o array de ocupação com 100 cadeiras e nenhum passageiro ocupado
        this.ocupacao = new boolean[100];
        this.passageirosOcupados = 0;
    }

    // Retorna o próximo assento livre
    public int proximoLivre() {
        for (int i = 0; i < ocupacao.length; i++) {
            if (!ocupacao[i]) {
                return i + 1;
            }
        }
        return -1; // Retorna -1 se não houver assentos livres
    }

    // Verifica se um assento específico está ocupado
    public boolean verifica(int numeroCadeira) {
        if (numeroCadeira >= 1 && numeroCadeira <= ocupacao.length) {
            return ocupacao[numeroCadeira - 1];
        } else {
            return false; // Retorna falso se o número da cadeira for inválido
        }
    }

    // Ocupa um assento específico se estiver livre
    public boolean ocupa(int numeroCadeira) {
        if (numeroCadeira >= 1 && numeroCadeira <= ocupacao.length && !ocupacao[numeroCadeira - 1]) {
            ocupacao[numeroCadeira - 1] = true;
            passageirosOcupados++;
            return true; // Retorna verdadeiro se o assento foi ocupado com sucesso
        } else {
            return false; // Retorna falso se o assento não puder ser ocupado
        }
    }

    // Retorna a quantidade de vagas disponíveis no voo
    public int vagas() {
        return ocupacao.length - passageirosOcupados;
    }

    // Retorna o número do voo
    public int getNumeroVoo() {
        return numeroVoo;
    }

    // Retorna a data do voo
    public Data getData() {
        return data;
    }

    // Representação em string do objeto Voo
    @Override
    public String toString() {
        return "Voo " + numeroVoo + " em " + data + " - Passageiros ocupados: " + passageirosOcupados;
    }

    // Método de clonagem do objeto Voo
    public Voo clone() {
        // Cria um novo objeto Voo com os mesmos atributos do original
        Voo cloneVoo = new Voo(numeroVoo, data.clone());
        // Clona o array de ocupação e a quantidade de passageiros ocupados
        cloneVoo.ocupacao = ocupacao.clone();
        cloneVoo.passageirosOcupados = passageirosOcupados;
        return cloneVoo; // Retorna o clone do objeto Voo
    }
}

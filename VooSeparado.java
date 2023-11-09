package Exercicio4;

import Exercicio2.Data;
import Exercicio3.Voo;

public class VooSeparado extends Voo {
    private int maxVagas;
    private int cadeirasFumantes;

    public VooSeparado(int numeroVoo, Data data, int maxVagas, int cadeirasFumantes) {
        super(numeroVoo, data);
        this.maxVagas = maxVagas;
        this.cadeirasFumantes = cadeirasFumantes;

        // Verifica se o número de vagas para fumantes é maior do que o máximo de vagas
        if (cadeirasFumantes > maxVagas) {
            cadeirasFumantes = maxVagas;
        }
    }

    @Override
    public int proximoLivre() {
        for (int i = 1; i <= maxVagas; i++) {
            if (!verifica(i)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean verifica(int numeroCadeira) {
        if (numeroCadeira >= 1 && numeroCadeira <= maxVagas) {
            return super.verifica(numeroCadeira);
        } else {
            return false;
        }
    }

    @Override
    public boolean ocupa(int numeroCadeira) {
        if (numeroCadeira >= 1 && numeroCadeira <= maxVagas) {
            return super.ocupa(numeroCadeira);
        } else {
            return false;
        }
    }

    public String tipo(int numeroCadeira) {
        if (numeroCadeira >= maxVagas - cadeirasFumantes + 1) {
            return "F"; // Cadeira para fumantes
        } else {
            return "N"; // Cadeira para não fumantes
        }
    }
    

    public int getMaxVagas() {
        return maxVagas;
    }

    public int getCadeirasFumantes() {
        return cadeirasFumantes;
    }
}

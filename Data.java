package Exercicio2;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor da classe Data
    public Data(int dia, int mes, int ano) {
        // Verifica se a data é válida antes de atribuir os valores
        if (isDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            // Se a data não for válida, define uma data padrão (01/01/0001)
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    // Método para comparar duas datas
    public int compara(Data outraData) {
        if (this.ano == outraData.ano && this.mes == outraData.mes && this.dia == outraData.dia) {
            return 0; // Retorna 0 se as datas forem iguais
        } else if (this.ano > outraData.ano || (this.ano == outraData.ano && this.mes > outraData.mes) || (this.ano == outraData.ano && this.mes == outraData.mes && this.dia > outraData.dia)) {
            return 1; // Retorna 1 se a data atual for maior que a outra data
        } else {
            return -1; // Retorna -1 se a data atual for menor que a outra data
        }
    }

    // Métodos getters para obter o dia, mês e ano
    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    // Retorna o nome do mês por extenso
    public String getMesExtenso() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[this.mes - 1];
    }

    public int getAno() {
        return this.ano;
    }

    // Verifica se o ano é bissexto
    public boolean isBissexto() {
        if ((this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0)) {
            return true; // Retorna verdadeiro se o ano for bissexto
        }
        return false; // Retorna falso se o ano não for bissexto
    }

    // Método de clonagem do objeto Data
    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }

    // Método privado para verificar se a data é válida
    private boolean isDataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false; // Retorna falso se o mês for inválido
        }

        if (dia < 1 || dia > getUltimoDiaDoMes(mes, ano)) {
            return false; // Retorna falso se o dia for inválido
        }

        return true; // Retorna verdadeiro se a data for válida
    }

    // Método privado para obter o último dia do mês
    private int getUltimoDiaDoMes(int mes, int ano) {
        if (mes == 2) {
            if (isBissexto(ano)) {
                return 29; // Retorna 29 se o ano for bissexto
            } else {
                return 28; // Retorna 28 se o ano não for bissexto
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30; // Retorna 30 para meses com 30 dias
        } else {
            return 31; // Retorna 31 para meses com 31 dias
        }
    }

    // Método privado para verificar se o ano é bissexto
    private boolean isBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true; // Retorna verdadeiro se o ano for bissexto
        }
        return false; // Retorna falso se o ano não for bissexto
    }

    // Representação em string do objeto Data no formato dd/mm/yyyy
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }
}

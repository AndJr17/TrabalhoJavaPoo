package Exercicio1;

public class Aluno {
	
	private int matricula;
	private String nome;
	private double notaProva1;
	private double notaProva2;
	private double notaTrabalho;
	
	Aluno(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
	}
	
	
	//Método que retorna méida 
	public double Media() {
		 double calcularMedia = (notaProva1 * 2.5 + notaProva2 * 2.5 + notaTrabalho * 2) / 7.5;
		 return calcularMedia;
	}
	
	//Método que retorna quanto o aluno precisa para a prova final
	public double Final() {
        double media = Media();
        
        if (media < 6.0) {
            return 6.0 - media;
        } else {
            return 0;
        }
	}
	
	
	@Override
	public String toString() {
	    return String.format("Aluno: %s (Matrícula: %s)\n" +
	                         "Média: %.2f\n" +
	                         "Nota necessária na prova final: %.2f",
	                         nome, matricula, Media(), Final());
	}


}

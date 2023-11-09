package Exercicio2;

public class DataTeste {
	  public static void main(String[] args) {
	      
		  
		  Data data1 = new Data(15, 11, 2023);
	        Data data2 = new Data(1, 1, 2023);
	        Data data3 = new Data(1, 1, 2023);
	        Data data4 = data1.clone();

	        int comparacao1 = data1.compara(data2);
	        int comparacao2 = data1.compara(data3);
	        int comparacao3 = data2.compara(data3);

	        System.out.println("Data 1: " + data1);
	        System.out.println("Data 2: " + data2);
	        System.out.println("Data 3: " + data3);
	        System.out.println("Data 4: " + data4);

	        System.out.println("Comparação 1: " + comparacao1);
	        System.out.println("Comparação 2: " + comparacao2);
	        System.out.println("Comparação 3: " + comparacao3);
	        System.out.println("Mês de Data 1: " + data1.getMesExtenso());
	        System.out.println("É bissexto? " + data1.isBissexto());
	  }
}


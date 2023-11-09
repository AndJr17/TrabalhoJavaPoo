package Exercicio1;

public class TesteAluno {
    public static void main(String[] args) {
       
    	Aluno a1 = new Aluno(1, "Anderson", 7.5, 8.0, 9.5);
        Aluno a2 = new Aluno(2, "Thiago", 6.0, 6.5, 7.0);
        Aluno a3 = new Aluno(3, "Eduardo", 8.0, 3.0, 6.0);
        Aluno a4 = new Aluno(2, "Marcos Paulo", 6.0, 5.5, 7.0);
        Aluno a5 = new Aluno(3, "Jonathan", 10.0, 6.0, 4.0);


        System.out.println(a1);
        System.out.println("\n" + a2);
        System.out.println("\n" + a3);
        System.out.println("\n" + a4);
        System.out.println("\n" + a5);
    }
}


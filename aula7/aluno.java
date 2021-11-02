package aula7;

public class aluno {
    public int Periodo = 1;

    public aluno(int n, double nota, int periodo) {
        System.out.printf("%nAluno %d criado - nota: %.2f\n", n, nota);
        System.out.printf("Periodo %d%n", periodo);

    }
}

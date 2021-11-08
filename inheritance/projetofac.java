package inheritance;

public class projetofac {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        aluno p2 = new aluno();
        professor p3 = new professor();
        funcionario p4 = new funcionario();

        p1.setNome("Joao");
        p1.setIdade(12);
        p1.setSexo("M");
        // p1..setmatricula(546); não é um método de classe pessoa

        p2.setNome("Carla");
        p2.setIdade(19);
        p2.setSexo("F");
        p2.setMatricula(1564);
        p2.infPessoa();

        p3.setNome("Alberto");
        p3.setIdade(28);
        p3.setSalario(15000);
        p3.setSexo("M");
        p3.setEspec("Engenharia");
        p3.infPessoa();

        p3.recebeAumento(10);

        p4.setNome("Luzia");
        p4.setIdade(47);
        p4.setSexo("F");
        p4.setSetor("Apoio");
        p4.setTrabalho("Decide");

        p4.infPessoa();

    }
}

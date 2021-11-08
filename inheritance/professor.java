package inheritance;

public class professor extends Pessoa {
    private String espec;
    private double salario;

    public String getEspec() {
        return (espec);
    }

    public void setEspec(String espec) {
        this.espec = espec;

    }

    public double getSalario() {
        return (salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



    public void recebeAumento(double adicional) {
        this.salario = salario * (1 + adicional);
        System.out.printf("Novo salario: %d%n", this.salario);
    }


    @Override
    public void infPessoa() {
        System.out.printf("Nome %s%n", getNome());
        System.out.printf("Idade: %s%n", getIdade());
        System.out.printf("Salario: %d%n", this.salario);
        System.out.printf("especialidade: %s%n", this.espec);
    }
}

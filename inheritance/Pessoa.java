package inheritance;

public class Pessoa {
    public String nome;
    public int idade;
    public String sexo;

    public void fazAniversario(){
        this.idade += 1;
    }

    public String getNome() {
        return (nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return (sexo);
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return (idade);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void infPessoa() {
        System.out.printf("--- Informacao da Pessoa ----");
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Idade: %d%n", this.idade);
        System.out.printf("Sexo: %s%n", this.sexo);
    }
}

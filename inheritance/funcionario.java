package inheritance;

public class funcionario extends Pessoa {
    private String setor;
    private String trabalho;
    private String funcao;

    public String getSetor() {
        return (setor);
    }

    public void setSetor(String setor) {
        this.setor = setor;

    }

    public String getTrabalho() {
        return (trabalho);
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;

    }

    public void mudaFuncao(){
        this.trabalho = funcao;
    }
}

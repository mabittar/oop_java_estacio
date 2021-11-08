package inheritance;

public class aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void cancelaMatricula(){
        System.out.println("Matricula sera cancelada");
    }

    public int getMatricula() {
        return (matricula);
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return (curso);
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void infPessoa(){
        System.out.printf("Matricula: %d%n", this.matricula);
        System.out.printf("Curso: %s%n", this.curso);
    }
}

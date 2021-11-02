package calculadora;

public class operacao {
    
    private String operacao;

    public void opera(String op, numero a, numero b) {
        numero res=new numero();
        if (op == "+") {
            res.setValor(a.getValor() + b.getValor());
            System.out.printf("O resultado da soma é %.2f\n", res);
        } else if (op == "-") {
            res.setValor(a.getValor() - b.getValor());
            System.out.printf("O resultado da diferença é %.2f\n", res);
        } else if (op == "*") {
            res.setValor(a.getValor() * b.getValor());
            System.out.printf("O resultado da multiplicação é %.2f\n", res);
        } else if (op == "/") {
            if (b.getValor() == 0) {
                System.out.printf("Não é possível dividir por 0\n");
            } else {
                res.setValor(a.getValor() / b.getValor());
                System.out.printf("O resultado da divisão é %.2f\n", res);
            }
        } else {
            System.out.printf("Operação não implemtada\n");
        }
    }

    public String operacao() {
        return this.operacao = "";
    }

    public void setOp(String op) {
        this.operacao = op;
    }

    public String getOp() {
        return this.operacao;
    }
}

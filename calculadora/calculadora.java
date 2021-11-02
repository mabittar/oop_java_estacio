package calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        numero num1=new numero();
        numero num2=new numero();
        operacao oper=new operacao();

        System.out.print("Entre com a operação desejada");
        oper.setOp(leia.next());
        System.out.print("Entre com o primeiro numero da operação");
        num1.setValor(leia.nextDouble());
        System.out.print("Entre com o segundo numero da operação");
        num2.setValor(leia.nextDouble());
        
        opera(oper.getOp(), num1.getValor(), num2.getValor());
        
        leia.close();
    }
}

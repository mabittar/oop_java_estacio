import java.util.Scanner;

public class calculos2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = in.nextDouble();

        System.out.println("Digite o segundo número: ");

        double num2 = in.nextDouble();
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        if (num1 % num2 == 0) {
            System.out.println("Os numeros sao multiplos");
        }
        else {
            System.out.println("Os numeros nao sao multiplos");
        }
        in.close();
    } 
}
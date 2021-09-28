import java.util.Scanner;

public class lista5e6 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, so = 1;
        System.out.println("Entre com um número maior que 0");
        num = leia.nextInt();
        for (int i = num; i >= 1; i--) {
            so = so * i;
        }
        System.out.printf("O fatorial desse numero: %d", so);
        leia.close();
    }
}

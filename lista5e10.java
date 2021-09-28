import java.util.Scanner;

public class lista5e10 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int soma =0;
        System.out.println("O numero de termos é: ");
        int n = leia.nextInt();
        System.out.println("O primeiro termo da progressão: ");
        int a1 = leia.nextInt();
        System.out.println("Razao da progressão: ");
        int r = leia.nextInt();
        soma = a1;
        System.out.printf("\n %d", a1);
        for(int i = 1; i < n; i++){
            soma += r;
            System.out.printf("\n %d", soma);
        }
        leia.close();
    }
}

import java.util.Scanner;

public class lista4e2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, total=0;
        double media, SOMA = 0;
        System.out.print("Numero: ");
        num = leia.nextInt();
        while (num > 0) {
            SOMA = SOMA + num;
            System.out.print("Numero: ");
            num = leia.nextInt();
            total+=1;

        }
        media = SOMA/total;
        System.out.printf("MEdia: %d\n", media);
        leia.close();
    }
}

import java.util.Scanner;

public class lista5e9b {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float x, fat = 0, e = 0, num = 0, i = 0;
        System.out.println("Numero: ");
        num = leia.nextFloat();

        for (i = 0; i <= num; i++) {
            fat = 1;
            for (x = i; x >= 1; x--) {
                fat = fat * x;
            }
            e = e + 1 / fat;
        }
        System.out.println(e);
        leia.close();

    }
}

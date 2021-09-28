import java.util.Scanner;

public class lista5e8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num = 0, aux = 0, x = 0, y = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.printf("Nume %d: ", i);
            num = leia.nextInt();
            aux = num;
            // num = 0;
            if (aux > x) {
                x = aux;
            }
        }
        System.out.println(x);
        leia.close();
    }
}

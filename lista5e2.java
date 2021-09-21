public class lista5e2 {
    public static void main(String[] args) {
        int SOMA = 0;
        for (double i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                SOMA += +i;
            }

        }
        System.out.printf("Somatorio: %d\n", SOMA);
    }
}

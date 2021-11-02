public class calculos {
    public static void main(String[] args) {
        int NUM1 = 100, NUM2 = 10, NUM3 = 20;
        int RESULT;
        System.out.print("== CALCULO DE VALORES ==\n\n");
        System.out.printf("Numero 1: %f %n", NUM1);
        System.out.printf("Soma: %.2f %n", NUM1 + NUM2 + NUM3);
        System.out.printf("Subtracao: %.2f %n", NUM1 - NUM2 - NUM3);
        System.out.printf("Multiplicacao: %.2f %n", NUM1 * NUM2 * NUM3);
        RESULT = NUM1 / NUM2 / NUM3;
        System.out.printf("Divisao: %.2f %n", RESULT);
    }
}

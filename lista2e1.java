import java.util.Scanner;

public class lista2e1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float VAR1, VAR2;

        System.out.print("***********************\n");
        System.out.print("*Qual numero eh maior?*\n");
        System.out.print("***********************\n");

        System.out.print("Primeiro Numero: ");
        VAR1 = leia.nextFloat();
        System.out.print("\nSegundo Numero: ");
        VAR2 = leia.nextFloat();
        if (VAR1 == VAR2) {
            System.out.printf("Ambos numeros sao iguais: %f\n", VAR1);
        } else if (VAR1 > VAR2){
            System.out.printf("O segundo numero eh maior: %f\n", VAR2);
        } else {
            System.out.printf("O segundo numero eh maior: %f\n", VAR2);
        }

        leia.close();
    }
}

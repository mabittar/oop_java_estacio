import java.util.Scanner;
public class temperatura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, d=0;
        float num1, num2, MIN=100, MAX=-100;
        System.out.print("Registra temperatura!!! \n\n");
        System.out.print("A final sera informado temperatura maxima e minima \n\n");
        System.out.print("Quantos dias de registro voce vai inserir?: ");
        d = in.nextInt();
        for (i = 0; i<d; i++){
            System.out.printf("Entre com a temperatura min do dia %d: ", i+1);
            num1 = in.nextFloat();
            if (num1 < MIN){
                MIN = num1;
            }
            System.out.printf("Entre com a temperatura max do dia %d: ", i+1);
            num2 = in.nextFloat();
            if (num1 > MAX) {
                MAX = num2;
            }

        }
        in.close();
        System.out.printf("A menor temperatura registrada: %.2f \n", MIN);
        System.out.printf("A maior temperatura registrada: %.2f \n", MAX);
        }
}

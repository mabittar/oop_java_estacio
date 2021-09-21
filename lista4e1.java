import java.util.Scanner;

public class lista4e1 {
    public static void main(String[] args){
        Scanner leia= new Scanner(System.in);
        int NUM, SOMA=0;
        System.out.print("Numero: ");
        NUM = leia.nextInt();
        while(NUM>=0){
            SOMA=SOMA + NUM;
            System.out.print("Numero: ");
            NUM = leia.nextInt();

        }
        System.out.printf("Somatorio: %d\n", SOMA);
        leia.close();
    }
}

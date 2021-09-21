import java.util.Scanner;
public class lista5e11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;
        System.out.print("Numero: ");
        num = leia.nextInt();
        
        for (int i = 1; i <= num; i++){
            System.out.printf(" %d x %d= %d \n", i, num, i*num);
        }
        
    }
}

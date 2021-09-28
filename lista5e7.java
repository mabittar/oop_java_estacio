import java.util.Scanner;

public class lista5e7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = 1, soma = 0 ,i = 0;
        float calc = 0;
        
        while (num > 0){
            System.out.println("Digite um número");
            num = leia.nextInt();
            if (num % 2 == 0){
                soma += num;
            }
            i++;
            
        }
        calc =(float) soma / (i - 1);
        
        System.out.println(calc);

        leia.close();
    }
}

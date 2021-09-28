import java.util.Scanner;

public class lista5e9 {
    // E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!
    public class Funcoes {
        public int soma(int num, double so){
            for (int i = num; i <= 1; i--) {
                if (num == 1) {
                    so += 1;
                } else {
                    so += +(1 / fatorial(num));
                }
            }
            return so;
        }

        public double fatorial(double num) {
            if (num == 0)
                return 1;
            return num * fatorial(num - 1);
            
        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Funcoes funcoes = new Funcoes();
        int num;
        double so = 1.0;
        System.out.println("Entre com um número maior que 0: ");
        num = leia.nextInt();
        if(num != 0){
            System.out.printf("O fatorial desse numero: %d", funcoes.soma(num, so));
        }else{
            System.out.println("O total é 0.");
        }
        leia.close();
    }

    

}

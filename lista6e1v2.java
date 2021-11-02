public class lista6e1v2 {
    
    public static void main(String[] args) {
        double r;
        r = soma(5, 6, 2.5, 3.6);
        System.out.printf("O resultado da soma é = %.2f", r);

    }
    public static double soma(double... nums){
        double res=0;
        for (double n:nums){
            res += n;
        }

        return res;
    }
}

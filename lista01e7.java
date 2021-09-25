import java.util.Scanner;
public class lista01e7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float LADO, AREATOTAL, AREACIRC, AREAQUAD, AREATRI;
        float PERIMTOTAL, PERIMCIRC, PERIMREST;

        System.out.print("***********************\n");
        System.out.print("***Quadra Esportiva****\n");
        System.out.print("***********************\n");

        System.out.print("Ladro da Quadra: ");
        LADO = leia.nextFloat();

        AREACIRC = ((float)3.14 * LADO/2 * LADO/2)/2;
        AREAQUAD = LADO * LADO;
        AREATRI = (LADO * LADO * (float)Math.sqrt(3))/4;
        AREATOTAL = AREACIRC + AREAQUAD + AREATRI;

        System.out.printf("Area da quadra: %f\n", AREATOTAL);
        
        PERIMCIRC = (2* (float)3.14 * LADO/2)/2;
        PERIMREST = 4 * LADO;
        PERIMTOTAL = PERIMCIRC + PERIMREST;

        System.out.printf("Perimetro da quadra: %f\n", PERIMTOTAL);
        leia.close();
    }
    
}

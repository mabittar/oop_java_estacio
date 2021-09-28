public class lista5e4d {
    public static void main(String[] args) {
        float i, q=50, total = 0;
        for (i = 1; i <= 50; i++) {
            total += i / q;
            q--;
        }
        System.out.println(total);
    }
}

public class lista5e4c {
    public static void main(String[] args) {
        float i, total = 0;
        for (i = 1; i <= 999; i = i + 2) {
            total += i/(i+1);
        }
        System.out.println(total);
    }
}

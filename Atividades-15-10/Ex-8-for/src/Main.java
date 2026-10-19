public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 8");

        for (int i = 0; i <= 10; i++) {
            System.out.printf("Tabuada do %d%n", i);

            for (int j = 0; j <= 10; j++) {

                int total = i * j;

                System.out.printf("%d x %d = %d%n", i, j, total);
            }
            System.out.println();
        }
    }
}
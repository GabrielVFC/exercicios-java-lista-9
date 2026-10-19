public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 16");

        int fibonacci = 10;
        long primeiroTermo = 0;
        long segundoTermo = 1;

        System.out.printf("Sequencia de fibonacci até o %d ºtermo%n", fibonacci);

        for (int i = 0; i < fibonacci; i++) {
            System.out.print(primeiroTermo + " ");

            long proxTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proxTermo;
        }
        System.out.println();
    }
}
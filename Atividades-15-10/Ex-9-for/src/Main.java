import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 9");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num ; i++) {
            fatorial *= i;
        }

        System.out.printf("O número %d, e seu valor fatorial: %d%n", num, fatorial);
    }
}
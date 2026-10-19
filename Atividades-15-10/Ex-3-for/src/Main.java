import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 3");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.printf("Valor: %d%n", i);
        }
    }
}
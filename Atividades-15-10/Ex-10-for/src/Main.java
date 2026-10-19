import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 10");
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int i = 0;
        int soma = 0;

        for (i = 0; i < 5; i++) {
            System.out.println("Digite um valor: ");
            num = sc.nextInt();

            soma += num;
        }

        int media = soma / i;

        System.out.printf("Valor da media dos números: %d%n", media);
    }
}
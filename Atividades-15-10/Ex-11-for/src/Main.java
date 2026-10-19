import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 11");
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int maior = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor: ");
            num = sc.nextInt();

            if (num > maior){
                maior = num;
            }
        }

        System.out.printf("O maior número é: %d%n", maior);

    }
}
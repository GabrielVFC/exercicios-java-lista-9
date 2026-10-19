import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 7");
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        System.out.println("Digite um valor limite: ");
        int limite = sc.nextInt();

        for (int i = 0; i <= limite ; i++) {
            soma += i;
        }

        System.out.printf("Valor da soma com base no limite: %d%n", soma);
    }
}
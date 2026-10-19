import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 14");
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        for (int i = 0; i < 6; i++) {

            System.out.println("Digite um valor: ");
            int num = sc.nextInt();

            if (num > 0){
                soma += num;
            } else {
                System.out.println("Número negativo digitado, digite um número positivo: ");
                num = sc.nextInt();
            }
        }

        System.out.printf("O valor da soma dos números negativos: %d%n", soma);
    }
}
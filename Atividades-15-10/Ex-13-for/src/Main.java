import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 13");
        Scanner sc = new Scanner(System.in);
        int contPares = 0;

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Digite um valor: ");
            int num = sc.nextInt();

            if (num % 2 == 0){
                contPares++;
            }
        }

        System.out.printf("Total de números pares digitados: %d%n", contPares);
    }
}
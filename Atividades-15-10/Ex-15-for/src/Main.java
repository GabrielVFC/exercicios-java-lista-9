import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 15");
        Scanner sc = new Scanner(System.in);

        int numMaiorQue50 = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um valor: ");
            int num = sc.nextInt();

            if (num > 50){
                numMaiorQue50++;
            } else {
                System.out.println("Número menor que 50, digite um número maior que 50: ");
                num = sc.nextInt();
            }
        }

        System.out.printf("Números maiores que 50: %d%n", numMaiorQue50);
    }
}
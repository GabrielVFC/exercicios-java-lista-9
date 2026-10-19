import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 18");
        Scanner sc = new Scanner(System.in);

        int divisores = 0;
        System.out.println("Digite um valor: ");
        int num = sc.nextInt();

        for (int i = 1; i < num; i++) {

            if(num % i == 0){
                divisores++;
            }

        }

        if (divisores == 2){
            System.out.println("Esse número é primo!");
        } else {
            System.out.println("Esse número não é primo");
        }
    }
}
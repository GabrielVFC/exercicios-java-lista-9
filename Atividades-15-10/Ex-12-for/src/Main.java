import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 12");
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        int menor = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor: ");
            num = sc.nextInt();
            if (i == 0 || num < menor){
                menor = num;
            }
        }

        System.out.printf("O menor número é: %d%n", menor);
    }
}
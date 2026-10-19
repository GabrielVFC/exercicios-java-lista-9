import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 20");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        double reprovado = 0.0;
        double aprovado = 0.0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o valor da nota do aluno: (ex: 2.8)");
            double nota = sc.nextDouble();

            if (nota >= 7){
                aprovado++;
            } else {
                reprovado++;
            }
        }
        System.out.printf("Aprovados: %.0f%n", aprovado);
        System.out.printf("Reprovados: %.0f%n", reprovado);
    }
}
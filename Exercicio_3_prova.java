import java.util.Scanner;
public class Exercicio_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escreva seu peso : ");
            double p = scanner.nextDouble();
            System.out.println("Escreva sua altura : ");
            double a = scanner.nextDouble();
            double imc = p / (a * a);
            System.out.println("O seu IMC é de " + imc);

        }
}

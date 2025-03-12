import java.util.Scanner;
public class Exercicio_5 {
        public static void main(String[] args) {
        System.out.println("Insira a base do triângulo: ");
        Scanner Base =  new Scanner(System.in);
        int B = Base.nextInt();
        System.out.println("Insira a altura do triângulo: ");
        Scanner Alt = new Scanner(System.in);
        int A = Alt.nextInt();
        double Area = (B*A)/2;
        System.out.println("A area do triângulo é " + Area+ "m²");

    }
}

package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner num = new Scanner(System.in);
        int num1 = (int) num.nextFloat();
        int num2 = num1 + 1;
        int num3 = num1 - 1;
        System.out.println("O antecessor de " + num1 + " é " + num3);
        System.out.println("O sucessor de " + num1 + " é " + num2);
    }
}

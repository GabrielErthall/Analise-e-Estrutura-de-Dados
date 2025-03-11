package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        System.out.println("Insira o valor de A: ");
        Scanner a = new Scanner(System.in);
        int A = a.nextInt();
        System.out.println("Insira o valor de B: ");
        Scanner b = new Scanner(System.in);
        int B = b.nextInt();
        System.out.println("Insira o valor de C: ");
        Scanner c = new Scanner(System.in);
        int C = c.nextInt();
        int resultado = B*B - 4*A*C;
        System.out.println("O resultado de delta é: " + resultado);
    }
}

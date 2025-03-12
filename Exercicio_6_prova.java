import java.util.Scanner;
public class Exercicio_6 {
    public static void main(String[] args) {
        System.out.println("Insira o valor de X²: ");
        Scanner Ax =  new Scanner(System.in);
        int A = Ax.nextInt();
        System.out.println("Insira o valor de X: ");
        Scanner Bx = new Scanner(System.in);
        int B = Bx.nextInt();
        System.out.println("Insira o valor de C: ");
        Scanner Cx = new Scanner(System.in);
        int C = Cx.nextInt();
        int Delta = (B*B) - (4*A)*C;
        System.out.println("O valor de delta é " + Delta);

    }
}

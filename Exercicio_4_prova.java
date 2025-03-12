import java.util.Scanner;
public class Exercicio_4 {
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner Num = new Scanner(System.in);
        int N = Num.nextInt();
        int N1 = (N*N);
        int N2 = N1*N;

        System.out.println("O numero " +N+" ao quadrado é "+N1+ " e ao cubo é " +N2);
    }
}

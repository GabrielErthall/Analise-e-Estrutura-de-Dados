package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner n = new Scanner(System.in);
        float n1 = n.nextFloat();
        float n2 = n1 * 2;
        float n3 = n1 / 3;
        n.close();
        System.out.println("O dobro de " + n1 + " é " + n2 );
        System.out.println("A terça parte de " + n1 + " é " + n3);
    }
}

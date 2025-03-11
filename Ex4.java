package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Digite um valor: ");
        Scanner no = new Scanner(System.in);
        int n1 = no.nextInt();
        System.out.println("Digite outro valor: ");
        int n2 = no.nextInt();
        int som = n1 + n2;
        System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a " +som);
    }
}

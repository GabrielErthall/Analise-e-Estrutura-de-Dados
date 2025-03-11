package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
       System.out.println("Nota 1: ");
       Scanner no = new Scanner(System.in);
       float n1 = no.nextFloat();
       System.out.println("Nota 2: ");
       float n2 = no.nextFloat();
       float med = (n1 + n2) / 2 ;
       System.out.println("A média entre " + n1 + " e " + n2 + " é igual a " + med);
    }
}

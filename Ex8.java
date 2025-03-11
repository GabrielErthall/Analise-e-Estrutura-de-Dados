package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Digite uma distancia em metros: ");
        Scanner n = new Scanner(System.in);
        int distancia  = n.nextInt();
        int cm = distancia * 100;
        System.out.println("Distância de " + cm + " Cm");
    }
}

package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        System.out.println("Quantos reais você tem? ");
        Scanner R$ = new Scanner(System.in);
        float reais = R$.nextFloat();
        float dolar = (float) (reais / 3.45);
        System.out.println("Com R$" + reais + " vocêe pode comprar US$" + dolar);
    }
}

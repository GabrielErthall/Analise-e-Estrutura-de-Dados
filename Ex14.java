package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        System.out.println("Digite quantos Km foram rodados:  ");
        Scanner K = new Scanner(System.in);
        int km = K.nextInt();
        System.out.println("Digite por quantos dias foi alugado o carro: ");
        Scanner d = new Scanner(System.in);
        int dias = d.nextInt();
        float preco1 = (float) (dias * 90);
        float preco2 = (float) (km * 0.2);
        float preco_f = (float) (preco1 + preco2);
        System.out.println("O valor do aluguel foi de: R$" + preco_f);

    }
    {
    }
}

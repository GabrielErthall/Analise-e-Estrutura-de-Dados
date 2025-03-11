package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Insira o valor do produto: ");
        Scanner v = new Scanner(System.in);
        float produto = v.nextFloat();
        float preco = (float) (produto - (produto * 0.05));
        System.out.println("O preço final do produto será: " + preco);
    }
}

package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        System.out.println("Digite o seu salário: ");
        Scanner sal = new Scanner(System.in);
        float salario = sal.nextFloat();
        float n_salario = (float) (  salario + (salario * 0.15));
        System.out.println("O seu novo salario sera: R$" + n_salario);
    }
}

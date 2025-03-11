package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        System.out.println("Digite o numero de dias trabalhados: ");
        Scanner d = new Scanner(System.in);
        int dias = d.nextInt();
        int horas = dias * 8;
        int  salario = horas * 25;
        System.out.println("O seu salario sera: R$" + salario);
    }
}

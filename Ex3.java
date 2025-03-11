package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Digite o nome do funcionario:");
        Scanner no = new Scanner(System.in);
        String func = no.nextLine();
        System.out.println("Digite o salario:");
        String sal = no.nextLine();
        System.out.println("Digite o mes:");
        String mes = no.nextLine();
        no.close();
        System.out.println("O funcionario " + func + " tem um salario de R$" + sal + " em " + mes);
    }
}

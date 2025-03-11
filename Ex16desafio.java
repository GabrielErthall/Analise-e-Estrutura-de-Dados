package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex16desafio {
    public static void main(String[] args) {
        System.out.println("Digite quantos cigarros você fuma por dia: ");
        Scanner c = new Scanner(System.in);
        int C_p_dia = c.nextInt();
        System.out.println("Digite a quantos anos você fuma: ");
        Scanner a = new Scanner(System.in);
        int anos_fum = a.nextInt();
        int c_p_ano = C_p_dia * 365;
        int c_vida =  (c_p_ano * anos_fum);
        int vida_perdida_min = c_vida * 10;
        int vida_perdida_dias = vida_perdida_min / 1440;
        System.out.println("Você perdeu " + vida_perdida_dias + " dias de vida");

    }
}

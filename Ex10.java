package algoritimo_e_estrutura_de_dados;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Digite largura da parede: ");
        Scanner L = new Scanner(System.in);
        float largura = L.nextFloat();
        System.out.println("Digite altura da parede: ");
        Scanner H = new Scanner(System.in);
        float altura = H.nextFloat();
        float area = (float) (largura * altura);
        int tinta = (int) (area / 2);
        if ( area % 2 != 0 ){
             tinta += 1;
        }else {

        }
        System.out.println("Para pintar uma parede com: " +  area + "m2. Sera necessário " + tinta + " latas de tinta");

    }

}

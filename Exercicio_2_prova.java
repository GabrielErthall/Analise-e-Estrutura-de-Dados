import java.util.Scanner;
public class Exercicio_2 {
    public static void main(String[] args) {
        System.out.print("Escreva a temperatura em Cº: ");
        Scanner C = new Scanner(System.in);
        int Ce = C.nextInt();
        float F = (float) (Ce* 5 /9 ) + 32;
        System.out.println("A temperatura de " +Ce+"Cº é igual a "+F+ "Fº");
    }
}

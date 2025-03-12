import java.util.Scanner;
public class Exercício_1 {

    public static void main(String[] args) {
        System.out.print("Escreva a temperatura em Fº: ");
        Scanner F = new Scanner(System.in);
        int Far = F.nextInt();
        float C = (float) (Far - 32) * (5 /9);
        System.out.println("A temperatura de " +Far+"Fº é igual a " +C+ "Cº");
    }
}

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        System.out.println("Informe o valor em Metros: ");
        double m;
        Scanner leia = new Scanner(System.in);
        m = leia.nextDouble();
        leia.close();

        double c;
        c = (m * 100);

        System.out.println("O valor em Centímetros : " + c);
    }

}
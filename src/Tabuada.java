import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numTabuada;
        int resulTabuada;


        System.out.println("Digite o numero da tabuada que você quer: ");
        numTabuada = scan.nextInt();

        int cont = 0;
        do {
            resulTabuada = cont * numTabuada;
            System.out.println(numTabuada + " X " + cont + " = " + resulTabuada);
            cont++;
        }while (cont <= 10);

    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] notas;
        double media;
        notas = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota " + (i+1));
            notas[i] = sc.nextInt();
        }
        for(int num : notas){
            System.out.println(num);
        }
        media = (notas[0] + notas[1] + notas[2] + notas[3]) / (double)notas.length;
        System.out.println("A média é: " + media);
        sc.close();
    }
}

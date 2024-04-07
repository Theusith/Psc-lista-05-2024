
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite 5 numeros:");
        for(int i = 9; i  >= 0; i--){
            array[i] = sc.nextInt();
        }
        for(int num : array){
            System.out.printf(num + " " );
        }
        sc.close();
    }
}

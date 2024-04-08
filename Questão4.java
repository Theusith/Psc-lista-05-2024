
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] array;
        int contador1 = 0, contador2 = 0;
        array = new char[10];

        for(int i = 0; i < array.length; i++){
            array[i] = sc.next().charAt(0);
            if(array[i] == 'a' || array[i] == 'e'|| array[i] == 'i' || array[i] == 'o' || array[i] == 'u'){
                contador1 += 1;
            }
        }
        System.out.println(contador1 + " consoantes.");
        for (char c : array) {
            if (Character.toLowerCase(c) == Character.toLowerCase('a') || Character.toLowerCase(c) == Character.toLowerCase('e') || Character.toLowerCase(c) == Character.toLowerCase('i') || Character.toLowerCase(c) == Character.toLowerCase('o') || Character.toLowerCase(c) == Character.toLowerCase('u')) {
                System.out.println(c);
                contador2 = 1;
            }
        }
        if(contador2 == 0){
            System.out.println("Nenhuma consoante encontrada!");
        }

        sc.close();
    }
}

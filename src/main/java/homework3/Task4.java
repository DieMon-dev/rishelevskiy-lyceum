package homework3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = num; i > 0; --i) {
            for (int f = num; f > 0; --f){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
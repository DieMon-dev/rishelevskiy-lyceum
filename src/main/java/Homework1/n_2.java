package Homework1;

import java.util.Scanner;

public class n_2 {
    public static void main(String[] args) {
        System.out.println("Введите радиус:");
        Scanner n = new Scanner(System.in);
        double x = n.nextInt();
        double s;
        s = Math.PI * Math.pow(x, 2);
        System.out.println("Площадь круга " + s + " квадратных единиц");
    }
}

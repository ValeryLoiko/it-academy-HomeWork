package funadamental;

import java.util.Scanner;

public class Fundamental {
    public static void main(String[] args) {
        double a = enterNumber();
        double b = enterNumber();
        double c = enterNumber();
        double d = enterNumber();
        System.out.println("Результат вычесления : " + resoult(a, b, c, d));

    }

    public static double resoult(double a, double b, double c, double d){
        double rezult = (a / c) * (b / d) - ((a * b - c) / (c * d));
        return rezult;
    }

    public static double enterNumber(){
        Scanner sc = new Scanner(System.in);
        double number;
        System.out.println("Введите число :");
        while (!sc.hasNextDouble()){
            System.out.println("Вы ввели не те данные");
            sc.nextLine();
        }
        number = sc.nextDouble();
        return number;

    }
}

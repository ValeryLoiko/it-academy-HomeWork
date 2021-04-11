package kompleksNumber;

import java.util.Scanner;

public class Logic {
    public int enterNumber() {
        Scanner sc = new Scanner(System.in);
        int number;

//        System.out.println("Введите число :");
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели ересь");
            sc.nextLine();
        }
        number = sc.nextInt();
        System.out.println("Вы ввели число : " + number);
        return number;
    }

    public static Numbers operationSum(Numbers numberZ1, Numbers numberZ2) {

        int rezult1 = numberZ1.getA() + numberZ2.getA();
        int rezult2 = numberZ1.getB() + numberZ2.getB();

        Numbers resoult = new Numbers(rezult1, rezult2);


        return resoult;
    }

    public static Numbers operationSubtract(Numbers numnerZ1, Numbers numberZ2) {
        int rezult1 = numnerZ1.getA() - numberZ2.getA();
        int rezult2 = numnerZ1.getB() - numberZ2.getB();

        Numbers resoult = new Numbers(rezult1, rezult2);


        return resoult;
    }
}

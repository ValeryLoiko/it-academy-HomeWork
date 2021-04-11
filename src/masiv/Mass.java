package masiv;

import java.util.ArrayList;

public class Mass {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 18, 34, 3, 56, 43, 27, 4, 23, 32};
        System.out.println(averageNumber(array));
        numbersMoreAverage(array);
    }

    public static int averageNumber(int[] numbers) {

        int sum = 0;
        int count = 0;
        int average;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            count++;
        }
        average = sum / count;
        return average;
    }

    public static ArrayList<Integer> numbersMoreAverage(int[] numbers) {
        int average = averageNumber(numbers);
        ArrayList<Integer> newMass = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                newMass.add(numbers[i]);
                System.out.print(numbers[i] + " ");
            }
        }

        return newMass;
    }
}

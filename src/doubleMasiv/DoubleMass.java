package doubleMasiv;

public class DoubleMass {
    public static void main(String[] args) {
        int[][] doubleMassiv = new int[][]{{ 0, 34, 2 }, { 9, 12, 18, 5 }, { 3, 4, 5 }};
        int [] maxNumber = masMax(doubleMassiv);
        int [] minNumber =masMin(doubleMassiv);

        System.out.println("Максимальное значение двойного массива : " + maxNumber[0] + ", координата I - " +
                maxNumber[1] + ", координата J - " + maxNumber[2]) ;

        System.out.println("Минимальное значение двойного массива : " + minNumber[0] + ", координата I - " +
                minNumber[1] + ", координата J - " + minNumber[2]) ;
    }

    public static int[] masMax(int[][] numbers) {
        int max = numbers[0][0];
        int maxI = 0;
        int maxJ = 0;
        int[] arrayMax = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        arrayMax[0] = max;
        arrayMax[1] = maxI;
        arrayMax[2] = maxJ;

        return arrayMax;
    }

    public static int[] masMin(int[][] numbers) {
        int min = numbers[0][0];
        int maxI = 0;
        int maxJ = 0;
        int[] arrayMin = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (min > numbers[i][j]) {
                    min = numbers[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        arrayMin[0] = min;
        arrayMin[1] = maxI;
        arrayMin[2] = maxJ;

        return arrayMin;
    }
}

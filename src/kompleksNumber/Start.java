package kompleksNumber;

public class Start {
    public static void main(String[] args) {
        int numA1, numA2, numB1, numB2;
        Logic logic = new Logic();
        View view = new View();

        System.out.println("Введите 1 значкние для Z1 : ");
        numA1 = logic.enterNumber();

        System.out.println("Введите 2 значкние для Z1 : ");
        numB1 = logic.enterNumber();

        System.out.println("Введите 1 значкние для Z2 : ");
        numA2 = logic.enterNumber();

        System.out.println("Введите 2 значкние для Z2 : ");
        numB2 = logic.enterNumber();

        Numbers numberZ1 = new Numbers(numA1, numB1);

        Numbers numberZ2 = new Numbers(numA2, numB2);

        Numbers resoult;

        resoult = Logic.operationSum(numberZ1, numberZ2);
        view.printSum(numberZ1, numberZ2, resoult);


 //       logic.operationSum(numberZ1, numberZ2);

        System.out.println();

       // logic.operationSubtract(numberZ1, numberZ2);
        resoult = Logic.operationSubtract(numberZ1,numberZ2);
        view.printSubt(numberZ1, numberZ2, resoult);
    }
}

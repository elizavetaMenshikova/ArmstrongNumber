import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isArmstrong(number));

    }

    private static boolean isArmstrong(int number) {
        int tempNumber = number;
        int cubesSum = 0;
        while (tempNumber != 0) {
            cubesSum += toCube(tempNumber % 10);
            tempNumber /= 10;
        }
        if (number == cubesSum) {
            return true;
        }
        return false;
    }

    private static int toCube(int number) {
        return number * number * number;
    }
}

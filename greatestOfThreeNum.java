
import java.util.Scanner;

class greatestOfThreeNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any three numbers :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int temp, result;
        temp = num1 > num2 ? num1 : num2;
        result = temp > num3 ? temp : num3;
        System.out.println(result + " is greatest number");

    }
}

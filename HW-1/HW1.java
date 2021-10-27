import java.util.Scanner;

public class HW1 {
    public static void ivan(String... args){

        Scanner height = new Scanner(System.in);
        System.out.print("Введіть перше значення: ");
        int one = height.nextInt();
        Scanner count = new Scanner(System.in);
        System.out.print("Введіть друге значення: ");
        int two = count.nextInt();
        System.out.printf("The height building %d m and %d floors", one, two);
        height.close(); count.close();
    }
}

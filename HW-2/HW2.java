import java.util.Random;
import java.util.Scanner;
public class HW2 {
    public static void main(String... args)
    {
        System.out.println("Задача №1:");
        int [] ivan = {15, 8, 24, 41, 9, 84};
        Random rnd = new Random();
        int iv = ivan[rnd.nextInt(ivan.length)];
        if(iv % 2 == 0)
        {
            System.out.println("I am lucky");
        }
        else
        {
            System.out.println("Run again");
        }

        System.out.printf("Випавше число: %d",iv);
        System.out.println("\n Задача №2:");
        System.out.println("If I drink, I die. If I eat, I am fine. What am I?");
        for(int i=0; i<3; i++)
        {
            Scanner gr = new Scanner(System.in);
            String mar = gr.nextLine();

            if(mar.equals("Fire"))
            {
                System.out.println("Great!");
                break;
            }
            else if (mar.equals("I don`t know"))
            {
                System.out.println("Answer: Fire");
                break;
            }
            else
            {
                System.out.println("Think again");
            }
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args)
    {

        Random input=new Random();
        int ranNum= input.nextInt(100);


        Scanner input1=new Scanner(System.in);
        int num;

        System.out.println("Enter tha any number between 1 to 100");
        int attempts;

        for( attempts=1;attempts<=10;attempts++) {

            num =input1.nextInt();
            System.out.println("Entered number is: "+ num);


            if (num == ranNum) {
                System.out.println("----------CONGRATULATION ---you Guess correct number");

                break;
            }
            else if (((ranNum - 10) < num) && (num < ranNum)) {
                System.out.println("you are very close to number,increment in your number");
                System.out.println("Remaining attempts is: "+(10-attempts));
                continue;
            } else if (((ranNum + 10) < num) && (num < ranNum)) {
                System.out.println("you are very close to number,decrement in your number");
                System.out.println("Remaining attempts is: "+(10-attempts));
                continue;
            }
            else if (((ranNum - 20) < num) && (num < ranNum)) {
                System.out.println("you are close to number,increment your number");
                System.out.println("Remaining attempts is: "+(10-attempts));
                continue;
            }
            else if (((ranNum + 20) > num) && (num > ranNum)) {
                System.out.println("you are close to number,decrement your number");
                System.out.println("Remaining attempts is: "+(10-attempts));
                continue;
            }
            else if (num < ranNum) {
                System.out.println("Entered number is too small ,enter grater number");
                System.out.println("Remaining attempts is: "+(10-attempts));
                continue;
            } else if (num > ranNum) {
                System.out.println("entered number is too big,enter small number");
                System.out.println("Remaining attempts is: "+(10-attempts));
                continue;
            } else
                System.out.println("entered number is invalid");

        }


    }
}
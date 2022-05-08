package Runner;

import Data.Bear;
import Data.Turtle;
import Data.Wild_Rabbit;

import java.util.Scanner;

public class ZooRunner {
    public static void main(String[] args) {

        Scanner myScanner=new Scanner(System.in);
        System.out.println("Welcome to 'Day in the Zoo' program!"+"\nPlease enter the number for the Animal you want to see more about:" );
        System.out.println("1 - Bear"+"\n2 - Wild Rabbit"+ "\n3 - Turtle");

        int selection=myScanner.nextInt();

        switch(selection){
            case 1:
                Bear newBear=new Bear();
                System.out.println("**************************");
                System.out.println(newBear.getInfo());
                break;

            case 2:
                Wild_Rabbit newRabbit=new Wild_Rabbit();
                System.out.println("**************************");
                System.out.println(newRabbit.getInfo());
                break;

            case 3:
                Turtle newTurtle=new Turtle();
                System.out.println("**************************");
                System.out.println(newTurtle.getInfo());
                break;

            default:
                System.out.println("Choose again!");
                break;
        }

    }
}

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        String reply;
        Scanner input = new Scanner(System.in);

        System.out.print("Would you like to add an animal to the zoo? (y/n)");
        reply = input.nextLine();

        if(reply.equals("y")) {

            System.out.println("Would you like to create a bird, a chicken or a sparrow? (b/c/s)");
            reply = input.nextLine();

            if(reply.equals("b")) {
                System.out.println("You cant create a bird!");
            }

            else if(reply.equals("c")) {
                Chicken userChicken = new Chicken();
                userChicken.fly();
            }

            else if(reply.equals("s")) {
                Sparrow userSparrow = new Sparrow();
                userSparrow.fly();
            }
        }

        else if(reply.equals("n")) {
            System.out.println("Ok! Exiting...");
        }

        else {
            System.out.println("Invalid operation. Exiting System...");
        }


    }
}

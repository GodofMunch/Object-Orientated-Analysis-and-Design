public class DiceGame {

    public static void main(String[] args) {
        Die firstDie = new Die();
        Die secondDie = new Die();

        firstDie.roll();
        secondDie.roll();

        System.out.println(firstDie.getFaceValue() + " " + secondDie.getFaceValue());
        if(firstDie.getFaceValue() + secondDie.getFaceValue() == 7)
            System.out.println("Winner Winner Chicken Dinner!");
        else
            System.out.println("You Lose Sucka!");
    }


}

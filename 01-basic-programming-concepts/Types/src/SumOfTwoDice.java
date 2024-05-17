public class SumOfTwoDice {
    public static void main(String[] args) {
        int sides = 6; //dice has 6 sides
        int a = 1 + (int) (Math.random() * sides);
        int b = 1 + (int) (Math.random() * sides);

        System.out.println("dice1 : " + a + " dice2 : " + b + " sum of these dices is : " + (a+b));

    }
}

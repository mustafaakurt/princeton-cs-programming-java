public class SumOfSines {
    public static void main(String[] args) {
        double degrees = Double.parseDouble(args[0]);
        double radians = Math.toRadians(degrees);

        double sumOfSines = Math.sin(radians * 2) + Math.sin(radians * 3);

        System.out.println("sum of sin(2t) + sin(3t) : " + sumOfSines);
    }
}

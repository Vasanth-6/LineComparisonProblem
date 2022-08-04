import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        float x1, y1, x2, y2;
        Scanner value = new Scanner(System.in);

        {

            System.out.println("Enter the value of x1 = ");
            x1 = value.nextFloat();

            System.out.println("Enter the value of y1 = ");
            y1 = value.nextFloat();

            System.out.println("Enter the value of x2 = ");
            x2 = value.nextFloat();

            System.out.println("Enter the value of y2 = ");
            y2 = value.nextFloat();

            double lengthOfALine = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
            System.out.println("Length of a line = " + lengthOfALine);
        }
    }
}

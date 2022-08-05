package com.bl.LineComparisonProblem;

import java.util.Scanner;

public class LineComparison {
    float x1,y1,x2,y2;
    Scanner value = new Scanner(System.in);

    public void linePoint()

    {
        System.out.println("Enter The Value of X1 :");
        x1=value.nextFloat();

        System.out.println("Enter The Value of Y1 :");
        y1=value.nextFloat();

        System.out.println("Enter the Value of X2 :");
        x2=value.nextFloat();

        System.out.println("Enter the Value of Y2 :");
        y2=value.nextFloat();

    }
    public double getLengthOfLine()
    {
        double lengthofLine = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return lengthofLine;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        LineComparison value1 = new LineComparison();
        LineComparison value2 = new LineComparison();

        value1.linePoint();
        value2.linePoint();

        double line1Length = value1.getLengthOfLine();
        System.out.println("Length of Line 1 = "+line1Length);

        double line2Length = value2.getLengthOfLine();
        System.out.println("Length of Line 2 = "+line2Length);

        if(line1Length == line2Length) {
            System.out.println("Length of Line 1 = Length of Line 2");
        } else {
            System.out.println("Length of Line 1 =! Length of Line 2");
        }
    }
}

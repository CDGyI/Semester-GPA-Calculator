import java.util.Scanner;
public class Main {

    //GPA calculation function
    public static double gpaCalc(double [][] creditsRe){
        double points = 0;
        double credits = 0;
        for (int column = 0; column < creditsRe.length; column ++){
            points += (creditsRe[column][0] * creditsRe[column][1]);
            credits += (creditsRe[column][0]);
        }
        double GPA = points / credits;
        return GPA;
    }

    //lette to double value function
    public static double converter (String letter){
        return switch (letter.toUpperCase().trim()) {
            case "A+" -> 4.0;
            case "A" -> 3.75;
            case "B+" -> 3.50;
            case "B" -> 3.0;
            case "C+" -> 2.5;
            case "C" -> 2.00;
            case "D+" -> 1.50;
            default -> 0;
        };


    }
    public static void main(String[] args) {
        //variables
        double credit;
        double points;
        Scanner input = new Scanner(System.in);
        int column;
        String grade;

        //input
        column = 1;
        while (column != 0) {
            System.out.print("Enter the number of courses you are taking this semester or press '0' to exit\n > ");
            column = input.nextInt();
            if (column == 0) System.exit(0);
            //array declaration
            double[][] semester = new double[column][2];

            //array inputs
            for (int i = 0; i < semester.length; i++) {
                System.out.println();
                System.out.println("--- Course " + (i + 1) + " ---");

                System.out.print("Enter course credit > ");
                semester[i][0] = input.nextDouble();
                System.out.print("Enter grade garde > ");
                grade = input.next();
                semester[i][1] = converter(grade);
            }
            //function calling
            System.out.println("\nYour GPA = " + gpaCalc(semester) + "\n");

    }}}
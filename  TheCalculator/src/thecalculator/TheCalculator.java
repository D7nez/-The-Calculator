package thecalculator;

import java.util.Scanner;

public class TheCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            menu();
            byte num1 = input.nextByte();

            if (num1 == 0) {
                break;
            }

            switch (num1) {
                case 1:
                    for (int i = 1;; i++) {
                        System.out.println("Enter the first number: ");
                        double n1 = input.nextDouble();
                        System.out.println("Enter the second number: ");
                        double n2 = input.nextDouble();
                        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                        System.out.println("Enter 1 return to the menu or any number to continue: ");
                        byte cORs = input.nextByte();
                        if (cORs == 1) {
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 1;; i++) {
                        System.out.println("Enter the first number:\n ");
                        double n1 = input.nextDouble();
                        System.out.println("Enter the second number: ");
                        double n2 = input.nextDouble();
                        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                        System.out.println("Enter 1 return to the menu or any number to continue: ");
                        byte cORs = input.nextByte();
                        if (cORs == 1) {
                            break;
                        }
                    }
                    break;
                case 3:
                    for (int i = 1;; i++) {
                        System.out.println("Enter the first number:\n ");
                        double n1 = input.nextDouble();
                        System.out.println("Enter the second number: ");
                        double n2 = input.nextDouble();
                        System.out.println(n1 + " × " + n2 + " = " + (n1 * n2));
                        System.out.print("Enter 1 return to the menu or any number to continue: ");
                        byte cORs = input.nextByte();
                        if (cORs == 1) {
                            break;
                        }
                    }
                    break;
                case 4:
                    for (int i = 1;; i++) {
                        System.out.println("Enter the first number:\n ");
                        double n1 = input.nextDouble();
                        System.out.println("Enter the second number:\n ");
                        double n2 = input.nextDouble();
                        System.out.println("num 1 / num 2 = " + n1 / n2);
                        System.out.println("Enter 1 return to the menu or any number to continue: ");
                        byte cORs = input.nextByte();
                        if (cORs == 1) {
                            break;
                        }
                    }
                    break;

                case 5:
                    for (int i = 1;; i++) {
                        System.out.println("Enter the first number:\n ");
                        double n2 = input.nextDouble();
                        System.out.println("Enter the second number:\n ");
                        double n3 = input.nextDouble();
                        System.out.println("num 1 % num 2 = " + n2 % n3);
                        System.out.println("Enter 1 return to the menu or any number to continue: ");
                        byte cORs = input.nextByte();
                        if (cORs == 1) {
                            break;
                        }
                    }
                    break;

                case 6:

                    for (;;) {
                        System.out.println("Enter the number ");
                        double n4 = input.nextDouble();
                        System.out.println("Enter the power ");
                        double p = input.nextDouble();
                        System.out.println("the power is :" + (Math.pow(n4, p)));
                        System.out.println("Enter 1 return to the menu or any number to continue: ");
                        byte cORs = input.nextByte();
                        if (cORs == 1) {
                            break;
                        }
                        break;
                    }
                case 7:
                    for (int i = 1;; i++) {
                        System.out.println("Enter the number that you want his Square root:\n");
                        double n4 = input.nextDouble();
                        System.out.println("the Square root for the entrance number = " + Math.sqrt(n4));
                        System.out.println("Enter 1 return to the menu or any number to continue: ");
                        byte cORs = input.nextByte();
                        if (cORs == 1) {
                            break;
                        }
                    }
                    break;

                case 8:
                    for (int i = 1;; i++) {
                        System.out.println("Enter the number that you want his Factorial\n ");
                        long n6 = input.nextLong();
                        System.out.println("the Factorial of the number is = " + Factorial(n6));
                        System.out.println("Enter 1 return to the menu or any number to continue: ");
                        byte cORs = input.nextByte();
                        if (cORs == 1) {
                            break;
                        }
                    }
                case 9:
                    for (int i = 1;; i++) {
                        System.out.println("Enter the number that you want his Logarithnm\n");
                        double n5 = input.nextDouble();
                        System.out.println("the Logarithnm of the number = " + Math.log(n5));
                        System.out.println("Enter 1 return to the menu or any number to continue: ");
                        byte cORs = input.nextByte();
                        if (cORs == 1) {
                            break;
                        }

                    }

                    break;

                case 10:
                    for (int i = 1;; i++) {
                        System.out.println("Enter the number:\n ");
                        double n = input.nextDouble();
                        System.out.println("sin" + n + " = " + Math.sin(n));
                        System.out.println("Enter 1 return to the menu or any number to continue: ");
                        byte cORs = input.nextByte();
                        if (cORs == 1) {
                            break;
                        }
                    }

                case 11:
                    for (int i = 1;; i++) {
                        System.out.println("Enter the number:\n ");
                        double n = input.nextDouble();
                        System.out.println("|" + n + "|" + " = " + Math.abs(n));
                        System.out.println("Enter 1 return to the menu or any number to continue: ");
                        byte cORs = input.nextByte();
                        if (cORs == 1) {
                            break;
                        }
                    }
                    break;
                case 12:
                    for (;;) {
                        System.out.println("Enter how many values: ");
                        byte n = input.nextByte();
                        double avg[] = new double[n];
                        System.out.println("Enter the values: ");
                        for (int i = 0; i < avg.length; i++) {
                            avg[i] = input.nextDouble();
                        }
                        System.out.println("The Average is " + avg(avg));
                        System.out.println("Enter 1 return to the menu or any number to continue: ");
                        byte cORs = input.nextByte();
                        if (cORs == 1) {
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("please choose from the menu.");
                    break;
            }

        } while (true);
        System.out.println("Thank you for using java calculator, bye.");

    }

    public static void menu() {
        System.out.println("\nWelcom to java calculater, please choose what you want to do: \n"
                + "enter 1 to get the Addition of two numbers \n"
                + "enter 2 to get the Subtraction of two numbers \n"
                + "enter 3 to get an Multiplication of two numbers\n"
                + "enter 4 to get the Division of two numbers \n"
                + "enter 5 to get the Modulus (a % b)\n"
                + "enter 6 to get an power of a number\n"
                + "enter 7 to get an Square root of (√𝑥\n "
                + "enter 8 to get Factorial of a number (n!) \n"
                + "enter 9 to get an Log(n)"
                + "enter 10 to get an 10. Sin(x) of a number\n"
                + "enter 11 to get. Absolute value (|x|) \n"
                + "enter 12 to get an average of a number\n"
                + "enter 0 if you want to exit\n");
    }

    public static double avg(double[] avg) {
        double total = 0;
        for (double values : avg) {
            total += values;
        }

        return total / avg.length;
    }

    public static long Factorial(long n6) {

        if (n6 == 1) {
            System.out.println("Factorial(" + n6 + ")=1");
            return 1;
        } else {
            System.out.println("Factorial(" + n6 + ") = " + n6 + "* Factorial(" + (n6 - 1) + ")");
            return n6 * Factorial(n6 - 1);
        }

    }
}

package session4.practice.homeworks;

import java.util.Scanner;

public class homeworks4 {
//    1. Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.
//
//    public static void main(String[] args) {
//        String stringOne = "OpenAi";
//        String stringTwo = "OpenAi";
//
//        System.out.println(stringOne == stringTwo);
//    }

//2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values.
// Use an equality operator to compare these two numbers and print the result.
// Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison. Print the result.

//    public static void main(String[] args) {
//
//        int firstNumber = 65;
//        int secondNumber = 32;
//        System.out.println(firstNumber == secondNumber);
//
//        String firstString = "Romania";
//        String secondString = "Romania";
//        System.out.println(firstString.equals(secondString));
//    }

//    3. Write a Java program that declares an integer variable age with a value of 20.
//    Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult".


//    public static void main(String[] arg) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your age.");
//        int number = scanner.nextInt();
//        int age = 20;
//
//        if (number > 18) {
//            System.out.println("I am adult");
//        } else if (number < 18) {
//            System.out.println("I am not an adult");
//        }
//    }

//    4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
//    Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a height in cm");
        int firstNumber = scanner.nextInt();
        int heightOne = 55;

        System.out.println("please enter an another height in cm");
        int secondNumber = scanner.nextInt();
        int heightTwo = 64;

        String x = (heightOne > heightTwo) ? "The heightOne is lesser then the heightTwo" : "The heightTwo is higher then the heightOne";
        System.out.println("maximumHeight");



    }


}





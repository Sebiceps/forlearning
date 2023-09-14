package session4.practice;

public class StringMemoryRefferance {

    public static void main(String[] args) {
        String greeting = new String("Hello");
        String greetingOne = "hello"; //"hello"
        String greetingTwo = "Hello";

        System.out.println(greetingOne == greetingTwo); //false
        System.out.println(greetingOne.equalsIgnoreCase(greetingTwo)); //true

        System.out.println(greeting == greetingOne);
        System.out.println(greeting.equals(greetingOne));


        int number1 = 10;
        double number2 = 10.0;
        System.out.println(number1 == number2);

    }
}
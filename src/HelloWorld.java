import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--\n");


//        long valuePi = pi=3.1415 926 535 8979 3238 4626 4338 3279;
        double floatVar = 3.1415;
        int intVar = 555;
        String stringVar = "Hello Alesha Estrada";
        

//  ----------  Here, we are using [ %f - float, %d - variable, %s - string ]
        System.out.format("The value of The float variable is   : " +
                "%f\nThe value of the integer variable is : %d\n" +
                "The string is                        : %s\n ", floatVar, intVar, stringVar);




    }
}

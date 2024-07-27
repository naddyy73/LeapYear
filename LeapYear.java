import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        int userInput;
        do {
            System.out.print("Enter a year or 0 to exit ");
            userInput = scanner.nextInt();
            year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a leap year");
        }
        }while(userInput != 0);
    }
}
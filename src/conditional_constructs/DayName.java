// write a program to print the name of the day [1: Sunday, 2: Monday .... ]
package conditional_constructs;

import java.util.Scanner;

public class DayName {

    public static void main(String[] args) {

        int dayNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter day number[1-7]: ");
        dayNumber = input.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Day numbers must be between 1 and 7");
        }

//        if(dayNumber == 1){
//            System.out.println("Sunday");
//        }
//        else {
//            if(dayNumber == 2){
//                System.out.println("Monday");
//            }
//            else {
//                if(dayNumber == 3){
//                    System.out.println("Tuesday");
//                }
//                else {
//                    if(dayNumber == 4){
//                        System.out.println("Wednesday");
//                    }
//                    else {
//                        if(dayNumber == 5){
//                            System.out.println("Thursday");
//                        }
//                        else {
//                            if(dayNumber == 6){
//                                System.out.println("Friday");
//                            }
//                            else {
//                                if(dayNumber == 7){
//                                    System.out.println("Saturday");
//                                }
//                                else {
//                                    System.out.println("Day number must be between 1 and 7");
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }


    }

}

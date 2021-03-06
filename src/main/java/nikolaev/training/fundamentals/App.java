package nikolaev.training.fundamentals;


import java.util.*;


/**
 * JAVA.FUNDAMENTALS
 * Optional Task 3
 * Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
 * Осуществить проверку корректности ввода чисел.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter a int number: ");
        try {
            num = in.nextInt();

            while (num>12 || num<1){
                System.out.print("Your number is not correct! \n" + "Enter a int number: ");
                num = in.nextInt();
            }
        }
        catch (InputMismatchException ex){
            System.out.println("Expected value of type int!");
        }
        finally {
            in.close();
        }

        switch (num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Your number is not correct!");
        }
    }
}

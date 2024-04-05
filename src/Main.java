
import java.util.Scanner;

public class Main {
//    public static  void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number  : ");
//        int num=sc.nextInt();
//        System.out.println("Enter power  : ");
//        int pow=sc.nextInt();
//        int powerOfNumber = getPowerOfNumber(2,6);
//        System.out.println(num+" ^ "+pow+" = "+powerOfNumber);
//
//
//        }
//
//
//    //Task 1
//    public static int getPowerOfNumber(int number, int power) {
//            int result = 1;
//            for (int i = 0; i < power; i++) {
//                result = number * result;
//            }
//            return result;
//        }
//
//
//
//
//


    //task 2

    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num1 : ");
            double num1 = sc.nextDouble();

            System.out.println("Enter  num2 : ");
            double num2 = sc.nextDouble();

            calculate(num1, num2);

            System.out.println("Enter choose : (yes/no)");
            String choose= sc.next();

            if(choose.equals("no")){
                System.out.println("Good bye");
                break;
            }
        }

    }

    public static void calculate(double num1, double num2) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation : (1. Add, 2. Subtract, 3. Multiply, 4. Divide)");
        int operation = sc.nextInt();

            double result = 0;
            switch (operation) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = substact(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;

            }

        System.out.println( "Result : " + result);


        }








    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double substact(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

}

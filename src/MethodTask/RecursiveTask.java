package MethodTask;

import java.util.Scanner;

public class RecursiveTask {

        public static void main(String args[]){

            Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();
            sc.close();
            System.out.println(findFibonacci(n));

        }




        public static int findFibonacci(int n){
            if(n==0){
                return 0;
            }
            else if(n==1){
                return 1;
            }
            else{
                return findFibonacci(n-1)+findFibonacci(n-2);
            }
        }




}

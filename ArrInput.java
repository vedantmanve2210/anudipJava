//Accept values from user

import java.util.Scanner;

public class ArrInput {
    public static void main(String[] args) {
        int a[]=new int[5];  //declaration of dynamic array
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 values");
        for( i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("You have entered: ");
        for(i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}

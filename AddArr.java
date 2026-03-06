import java.util.Scanner;

public class AddArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5]; 
        int b[]=new int[5];
        int c[]=new int[5]; //declaration of dynamic array
        int i;
        System.out.println("Enter 5 values for array1");
        for( i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter 5 values for array2");
        for( i=0;i<5;i++){
            b[i]=sc.nextInt();
        }

        System.out.println("addition of 2 arrays: ");
        for(i=0;i<5;i++){
            c[i]=a[i]+b[i];
            System.out.println(c[i]);
        }
        sc.close();
    }
}

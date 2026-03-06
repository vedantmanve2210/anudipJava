import java.util.Scanner;

public class minArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;        
        int a[] = new int[5];

        System.out.println("Enter array elements:");
        for(i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int min=a[0];
        for(i=0;i<=4;i++){
         if(a[i]< min){
            min=a[i];
        }
    }
    System.out.println("minimun number in array is: "+min);
} 
}

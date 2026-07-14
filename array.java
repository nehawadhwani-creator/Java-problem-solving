import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
        System.out.println("Enter num of elements: "+ size);
       int[] arrayIndex = new int[size];
        int i =  0;
        long sum = 0;
        while(i<size){
            System.out.println("enter the element" + (i+1) + " : ");
            arrayIndex[i] = sc.nextInt();
             sum = sum + arrayIndex[i];
            i++;
        }
        double avg = (double) sum / size;
        System.out.println("sum is: "+sum);
        System.out.println("Average is: "+ avg);

    }
}
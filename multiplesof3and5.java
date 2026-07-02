import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int N = in.nextInt();
            int sum = 0;
        for(int i = 1; i<N;i++){
            if(i%3==0 || i%5==0 ){
                sum +=i; 
        
            }}
             System.out.println(sum);
        }
        }
    
}

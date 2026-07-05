import java.util.Scanner;
public class calculator {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int ans = 0;
        char op = in.next().trim().charAt(ans);
        System.out.println("Enter the operator:"+op);
        if (op=='+'|| op=='-'||op=='*'||op=='/' || op=='%') {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println("Enter first number: "+num1);
            System.out.println("Enter second number: "+num2);

        if(op=='+'){
        ans =  num1 + num2;


     }
     if (op=='-') {
        ans = num1 - num2;
        
     }
     if (op=='*') {
        ans = num1 * num2;
        
     }
     if (op=='/') {
    ans = num1 / num2;        
     }
     if(op=='%'){
        ans= num1 % num2;
     }
    }
 else{
        System.out.println("invalid!!");
     }
System.out.println("Answer: "+ ans);
}
    
}


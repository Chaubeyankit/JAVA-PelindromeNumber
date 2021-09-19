import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int n, rev=0, Z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Z =n;
        while (n>0){
            rev =(rev*10)+n%10;
            n =n/10;
        }if (rev==Z){
            System.out.println("Given number "+Z+" is palindrome");
        }
        else {
            System.out.println("Given number "+Z+" is not palindrome");
        }
    }
}
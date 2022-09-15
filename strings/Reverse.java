package Company.String;

import java.util.Scanner;

public class Reverse {

    public static void reverse(char name[]) {
        int n = name.length;
        int start = 0;
        int end = n-1;

        while (start < end) {
            char temp = name[start];
            name[start] = name[end];
            name[end] = temp;

            start++;
            end--;
        }
        System.out.print("Reverse of your name is: ");
        for (int i = 0; i < name.length; i++) 
            System.out.print(name[i]);
    }

    public static boolean palindrome(char name[]){
        int n = name.length;
        int start = 0;
        int end = n-1;

        if(name[start] == name[end]){
            start++;
            end--;
            return true;
        }
        else{
            return false;
        }
    }

    

    public static void main(String[] args) {

        System.out.print("enter your name: ");

        Scanner input = new Scanner(System.in);
        char [] name= input.next().toCharArray();

        System.out.print("Your name is: ");
        for (int i = 0; i < name.length; i++) 
            System.out.print(name[i]);
        
        System.out.println();
   
        reverse(name);

        System.out.println();

        System.out.println("is palindrome? " + palindrome(name));
    }

}
 

import java.io.*;
import java.util.Scanner;
public class StringReverse {

   public static void main(String args[]) {
	  String[]  a = new String[10];
	  int i =0;
	  int number =1;
	  java.util.Scanner input = new java.util.Scanner(System.in);
	  number = input.nextInt();
	while(number >= 0){
		System.out.print("Enter a String: ");
		String UserInput = input.nextLine();
		a[i] = UserInput.toLowerCase();
		number--;
		i++;
	}
	number = 1;
     while(number < i){
      System.out.print("The String You Entered was :" + a[number] +"\n");
      number++;
   }
}
}
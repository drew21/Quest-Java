import java.io.*;
import java.util.Scanner;
public class number {

   public static void main(String args[]) {
	  int[]  a = new int[10];
	  int i =0;
	  int number =1;
	  java.util.Scanner input = new java.util.Scanner(System.in);
	  number = input.nextInt();
	while(number >= 1){
		int UserInput = input.nextInt();
		int UserInput2 = input.nextInt();
		if(UserInput != UserInput2){
			a[i] = (UserInput+UserInput2);
		}else{
			a[i] = ((UserInput+UserInput2)+(UserInput+UserInput2));
		}
		
		number--;
		i++;
	}
	while(number<i){
      System.out.print(a[number] +"\n");
      number++;
	}
   }
}
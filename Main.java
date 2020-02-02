import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        String inputString;
        
        Scanner scanner = new Scanner(System.in);
        
        int count;// occurence of letter
		int times = -1;
		times = scanner.nextInt();// number of words
		int finalt= (times);
        int[] sum = new int[finalt+1];
		int total=0, i=0;
		
		while(times >= 0){
        //System.out.println("Enter a string : ");
        
        inputString = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char character : inputString.toCharArray()) {
            
            if (map.containsKey(character)) {
                count = map.get(character);
                map.put(character, count + 1);
            } else {
                map.put(character, 1);
            }
        }
        
		
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			int keyvalue = letnum(entry.getKey());
			int entryvalue = entry.getValue();
           // System.out.println(entry.getKey() + " : " + (entry.getValue() +" "+ (entry.getKey()+ " value "+keyvalue)));
			total+=entryvalue * keyvalue;
			//System.out.println(" Total = "+total);
			
			
        }
		//System.out.println("This is I "+ i);
		if(i <= (finalt)){
			sum[i] = total;
			i++;
		}
		total=0;
		times--;
		}
		int j=1;
		while (j < finalt+1){
		//System.out.println("This is j "+ j);
		System.out.println(sum[j]);
		j++;
		}
		//System.out.println(sum[0]);
    }
	static int letnum(char letter){
		switch(letter){
			case 'a':
				return 1;
		    case 'b':
				return 2;
			case 'c':
				return 3;
			case 'd':
				return 4;
			case 'e':
				return 5;
			case 'f':
				return 6;
			case 'g':
				return 7;
			case 'h':
				return 8;
			case 'i':
				return 9;
			case 'j':
				return 10;
			case 'k':
				return 11;
			case 'l':
				return 12;
			case 'm':
				return 13;
			case 'n':
				return 14;
			case 'o':
				return 15;
			case 'p':
				return 16;
			case 'q':
				return 17;
			case 'r':
				return 18;
			case 's':
				return 19;
			case 't':
				return 20;
			case 'u':
				return 21;
			case 'v':
				return 22;
			case 'w':
				return 23;
			case 'x':
				return 24;
			case 'y':
				return 25;
			case 'z':
				return 26;
			default:
				return 1;
			
		}
	}
}
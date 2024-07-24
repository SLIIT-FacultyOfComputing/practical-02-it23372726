import java.util.Scanner;

public class Part01{
	public static void main(String[] arg){
		Scanner kybrd = new Scanner(System.in);
		String[] fulname,parts;
		fulname = new String[2];
		parts = new String[3];

		int i=0;
		while(i<2){             //loop for to enter two names
			StringBuilder name = new StringBuilder();
			System.out.printf("\n\nEnter your First Name: ");
			name.append(kybrd.nextLine());   // getting first name
			System.out.printf("\nEnter your Middle Name: ");
			name.append(" " + kybrd.nextLine());	// getting middle name
			System.out.printf("\nEnter your Last Name: ");
			name.append(" " + kybrd.nextLine());	// getting last name

			fulname[i] = name.toString(); // fullname teransfer to "fulname" array
			int count = 0;
			parts = fulname[i].split(" ");	// spliting the full name to 3 parts and store in "parts" array
			
			
			fulname[i] = fulname[i].toUpperCase();	// converting all letters to uppercase
			for(char c : fulname[i].toCharArray()){	// for count vowels
                             	if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                                        count = count +1;
                                }
                        }
			fulname[i] = fulname[i].replace("A","@");	// replace A-> @
			fulname[i] = fulname[i].replace("E","3");	// replace E-> 3
			
			System.out.println("\n\nName = " + fulname[i]);
                        System.out.println("\nFirst Name = " + parts[0]);
                        System.out.println("Middle Name = " + parts[1]);
                        System.out.println("Last Name = " + parts[2]);
			
                        System.out.println("Vowels in name : " + count);

			i = i +1;

		}
		if(fulname[0].equals(fulname[1])){	//check the names we entered are equal or not
			System.out.println("Names are same!");
		}
		else{
			System.out.println("Names are different");
		}

		System.out.printf("\nEnter a data to Trim : ");
		String Trim = kybrd.nextLine();
		Trim =   Trim.trim();				//Trim the entered string
                System.out.println("Trimed Value : " + Trim);
		
	}

}

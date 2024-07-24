import java.util.Scanner;

public class Part01{
	public static void main(String[] arg){
		Scanner kybrd = new Scanner(System.in);
		String[] fulname,parts;
		fulname = new String[2];
		parts = new String[3];

		int i=0;
		while(i<2){
			StringBuilder name = new StringBuilder();
			System.out.printf("\n\nEnter your First Name: ");
			name.append(kybrd.nextLine());
			System.out.printf("\nEnter your Middle Name: ");
			name.append(" " + kybrd.nextLine());
			System.out.printf("\nEnter your Last Name: ");
			name.append(" " + kybrd.nextLine());

			fulname[i] = name.toString();
			int count = 0;
			parts = fulname[i].split(" ");
			
			
			fulname[i] = fulname[i].toUpperCase();
			for(char c : fulname[i].toCharArray()){
                             	if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                                        count = count +1;
                                }
                        }
			fulname[i] = fulname[i].replace("A","@");
			fulname[i] = fulname[i].replace("E","3");
			
			System.out.println("\n\nName = " + fulname[i]);
                        System.out.println("\nFirst Name = " + parts[0]);
                        System.out.println("Middle Name = " + parts[1]);
                        System.out.println("Last Name = " + parts[2]);
			
                        System.out.println("Vowels in name : " + count);

			i = i +1;

		}
		if(fulname[0].equals(fulname[1])){
			System.out.println("Names are same!");
		}
		else{
			System.out.println("Names are different");
		}

		System.out.printf("\nEnter a data to Trim : ");
		String Trim = kybrd.nextLine();
		Trim =   Trim.trim();
                System.out.println("Trimed Value : " + Trim);
		
	}

}

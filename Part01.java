import java.util.Scanner;

public class Part01{
	public static void main(String[] arg){
		Scanner kybrd = new Scanner(System.in);
		String[] fulname;
		fulname = new String[2];

		int i=0;
		while(i<2){
			StringBuilder name = new StringBuilder();
			System.out.printf("Enter your First Name: ");
			name.append(kybrd.nextLine());
			System.out.printf("\nEnter your Middle Name: ");
			name.append(" " + kybrd.nextLine());
			System.out.printf("\nEnter your Last Name: ");
			name.append(" " + kybrd.nextLine());

			fulname[i] = name.toString();
			System.out.println("\n\nName = " + fulname[i]);
			i = i +1;
		}
		if(fulname[0].equals(fulname[1])){
			System.out.println("Names are same!");
		}
		else{
			System.out.println("Names are different");
		}
	}

}

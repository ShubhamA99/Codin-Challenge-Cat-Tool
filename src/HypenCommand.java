

import java.util.Scanner;



public class HypenCommand implements  BaseCommand{
	
	
	


	@Override
	public void performAction() {
		 Scanner scanner = new Scanner(System.in);
         while (scanner.hasNextLine()) {
             System.out.println( scanner.nextLine());
         }
         scanner.close();
	}

}

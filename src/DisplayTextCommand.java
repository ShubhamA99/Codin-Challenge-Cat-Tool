

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DisplayTextCommand implements  BaseCommand{
	
	
	private List<String> fileNames;

	
	
	public DisplayTextCommand(String[] args) {
		this.fileNames = new ArrayList<String>();
		for(String fileName :args) {
			fileNames.add(fileName);
		}
		
	}



	@Override
	public void performAction() {
		 File file = new File(fileNames.get(0));
         Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(String.format( " Unable to Find File - %s", fileNames.get(0) ));
		}
         while (scanner.hasNextLine()) {
             System.out.println(scanner.nextLine());
         }
         scanner.close();
	}
	
	
	

}

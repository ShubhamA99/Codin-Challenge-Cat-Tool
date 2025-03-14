

public class cccat {

	public static void main(String[] args) {
		
		Helper helper = new Helper();

		boolean validatedInput = helper.validInput(args);
		
		if(!validatedInput) {
			System.out.println("not valid command arguments please check");
		}
		
		BaseCommand command	= helper.commandFactoryPattern(args);
		
		command.performAction();
		
	}
	
	
	
	
	
}

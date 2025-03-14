

public class Helper {
	
	
	public boolean validInput(String[] input) {
			
			if(input.length == 0) {
				return false;
			}
			
			return true;
		}
		
		
	public BaseCommand  commandFactoryPattern(String[] args) {
			
		if(args[0].equalsIgnoreCase("-")) {
			return new HypenCommand();
		}
		
		return new DisplayTextCommand(args);
	}

}

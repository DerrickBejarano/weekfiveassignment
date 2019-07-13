
public class App {

	public static void main(String[] args) {
		
		Logger ASLlogger = new ASLogger();
		ASLlogger.Log("This");
			
		System.out.println(""); //Added blank space to separate the logs
		
		Logger ASElogger = new ASLogger();
		ASElogger.Error("Code");
		
		System.out.println(""); //Added blank space to separate the logs
		
		Logger SPLlogger = new SPLogger();
		SPLlogger.Log("Should");
			
		System.out.println(""); //Added blank space to separate the logs
		
		Logger SPElogger = new SPLogger();
		SPElogger.Error("Work");
	}

}

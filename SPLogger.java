
public class SPLogger implements Logger {

	@Override
	public void Log(String Log) {
		 
		System.out.println(Log.replace("", " ").trim());
		
	}

	@Override
	public void Error(String Error) {

		System.out.println("Error: " + Error.replace("", " ").trim());
		
	}



}

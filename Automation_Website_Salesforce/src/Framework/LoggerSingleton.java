package Framework;

public class LoggerSingleton {
	
	static LoggerSingleton logger;
	
	private LoggerSingleton()
	{
		
	}
	
	public static LoggerSingleton getInstance()
	{
		if (logger == null)
		{
			synchronized(LoggerSingleton.class){
			if(logger == null)
			{
				logger = new LoggerSingleton();
			}
		}
		}
		
		return logger;
		
	}

}

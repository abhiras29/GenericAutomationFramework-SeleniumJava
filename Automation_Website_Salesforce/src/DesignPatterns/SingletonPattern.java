package DesignPatterns;

import Framework.LoggerSingleton;

public class SingletonPattern {
		
		static SingletonPattern Instance;
		
		private SingletonPattern()  // Make private constructor
		{
			
		}
		
		public static SingletonPattern getInstance()
		{
			if (Instance == null)
			{
				synchronized(LoggerSingleton.class){ //synchronized for thread safe
				if(Instance == null) //double-check
				{
					Instance = new SingletonPattern();
				}
			}
			}
			
			return Instance;
			
		}
}



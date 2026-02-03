package com.autogenAccNo;

public class AutoGenAccNo {
	

	
		
		public static long generateAccNo() {
		long autoGenAccNo=(long)(Math.random()*Math.pow(10, 12));
		return autoGenAccNo;
	}
}



package edu.iis.mto.time;

import org.joda.time.DateTime;

public class NTime implements Data_Time_Interface {
	
	public DateTime nowTime()
	{
		return new DateTime();
	}

}

package org.testing.logreportcapture;

import com.relevantcodes.extentreports.ExtentReports;

public class reporthandle 
{
	public static ExtentReports reporthandling(String filePath)
	{
		ExtentReports report=new ExtentReports(filePath, false);
		return report;
		
	}
}

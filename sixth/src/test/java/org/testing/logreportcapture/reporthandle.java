package org.testing.logreportcapture;

import com.relevantcodes.extentreports.ExtentReports;

public class reporthandle 
{
	public static ExtentReports reporthandling(String Path)
	{
		ExtentReports report=new ExtentReports(Path, false);
		return report;
		
	}
}

package org.testing.logreportcapture;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class loghandle {
	public static void logcapture(String classname, String logmsg)
	{
		DOMConfigurator.configure("../sixth/layout.xml");
		Logger l=Logger.getLogger(classname);
		l.info(logmsg);
	}
}

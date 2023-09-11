package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonparsingusingorgjson 
{
	public static void jsonparse(String repsonsedata, String keyname)
	{
		JSONArray array=new JSONArray(repsonsedata);
		int l=array.length();
		for(int i=0;i<l;i++)
		{
			JSONObject j=array.getJSONObject(i);
			System.out.println(j.get(keyname));
		}
	}
	public static String jsonparseget(String responsedata, String keyname)
	{
		JSONObject j=new JSONObject(responsedata);
		return j.getString(keyname);
	}
}

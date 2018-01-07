package com.ag.web.j2eemavenapp;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Properties;


public class App1 {
	public  String Sample() {
		return "Sample";
	}
	
	public String SampleApp() {
		return "This is APP1.java";
    }
	
	public static String propfile() throws IOException {
		FileInputStream fs;
		Properties property;
		InetAddress ips;
		ips = InetAddress.getLocalHost();
        String hostname = ips.getHostName();
        hostname = "devl";
        String propfilename = null;
        if ((hostname).equals("W17044768")){ propfilename="prod.properties";}
        if ((hostname).equals("devl")){ propfilename="devl.properties";}
        if ((hostname).equals("qual")){ propfilename="qual.properties";}
        fs= new FileInputStream(System.getProperty("user.dir")+"\\workspace\\j2eeapp\\j2eemavenapp\\"+propfilename);
        //fs= new FileInputStream(System.getProperty("user.dir")+"\\"+propfilename);
		property = new Properties();
		property.load(fs);
		if ((hostname).equals("W17044768")){
			System.out.println(property.getProperty("Env")+"-->"+property.getProperty("class"));
		}
		return property.getProperty("Env");
    }

}

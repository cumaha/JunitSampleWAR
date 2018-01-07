package propertiesfiles;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.net.InetAddress;
import org.junit.Test;
import com.ag.web.j2eemavenapp.App1;
//import com.ag.web.j2eemavenapp.App1Test;

public class Propertyfileclass {
	
	Properties property;
	FileInputStream fs;
	
	@Test
	public void testProperty() throws IOException{
		InetAddress ips;
		ips = InetAddress.getLocalHost();
        String hostname = ips.getHostName();
		hostname="devl";
		App1 appp1 = new App1();
		System.out.println(appp1.Sample());
		if ((hostname).equals("W17044768")){
		   fs= new FileInputStream(System.getProperty("user.dir")+"\\prod.properties");
		}
		if ((hostname).equals("devl")){
			   fs= new FileInputStream(System.getProperty("user.dir")+"\\devl.properties");
		}
		property = new Properties();
		property.load(fs);
		System.out.println(property.getProperty("Env"));
	}
	

}


//System.out.println(ips.getHostName());
//System.out.println(ips);
//System.out.println(hostname);

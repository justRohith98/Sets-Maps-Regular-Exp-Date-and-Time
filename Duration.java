package dareAndtime;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class Duration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file = new File("C:\\Users\\just Rohith\\Downloads\\Feature Film.txt");
String x=FileUtils.readFileToString(file,"UTF-8");
System.out.println(x);
	}

}

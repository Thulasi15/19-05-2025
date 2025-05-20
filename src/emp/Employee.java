package emp;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;





public class Employee {


	
	public static void main(String[] args) throws IOException {
			File f= new File("E:\\test\\login.txt");
			boolean newFile = f.createNewFile();
			System.out.println(newFile);
			
			
	  	FileUtils.write(f," Java's key feature is its ability to run on different operating system   ");
	  	FileUtils.write(f, " Java supports multithreading",true);
	  	FileUtils.write(f, "simple program",true); 
List<String> lines=FileUtils.readLines(f);
//System.out.println(lines);


	}

public void statement() {
	System.out.println("merging pull request");
}


}
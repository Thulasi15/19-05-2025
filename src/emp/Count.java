package emp;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;


public class Count {
 public static void main(String[] args) throws IOException {
	// File f = new File("E:\\D:\\Java\\Selenium\\Material");
	 //boolean newFile=f.createNewFile();
	 File f= new File("E:\\test\\login.txt");
	 boolean can=f.canRead();
	 System.out.println(can);
	 File f2=new File("E:\\test\\emp.txt");
	 boolean newFile=f2.createNewFile();
	 System.out.println(newFile);
	
	 }
 
 
 public void editing() {
	 System.out.println("checking  ");
 }

 }

     


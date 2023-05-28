import java.io.*;
 

public class FileLet {

	public static void main(String[] args) throws IOException 
	{
		String fileName = "xbc.txt";
		String fileName2 = "abc.txt";
		String fileName3 = "partha.txt";
		String directoryName = "IPLnames";
		
		
		
		File f = new File(fileName);
		File f2 = new File(fileName2);
		File f3 = new File(fileName3);
		File f4 = new File(directoryName);
		File f5 = new File("iNeuron");
		
		f5.mkdir();
		
		File f6 = new File(f5,"learnings.txt");
		f6.createNewFile();
		
		System.out.println(f6.exists());
		
		
		
		
		
		f4.mkdir();
		System.out.println(f4.exists());
		
		f.createNewFile();
		
		System.out.println(f.exists());
		System.out.println(f2.exists());
		
		f3.createNewFile();
		System.out.println(f3.exists());
		
		
		System.out.println("Checking what is it file or directory :: "+ f3.isFile());
		System.out.println("Is it a directoy :: "+f4.isDirectory());
		System.out.println("Is it hidden :: "+f2.isHidden());
		
		
		

	}

}

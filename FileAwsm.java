import java.io.*;

public class FileAwsm {

	public static void main(String[] args) throws IOException
	{
		String location = "c:\\pwSkills";
		
		File f = new File(location);
		f.mkdir();
		
		File f1 = new File(f,"new.txt");
		f1.createNewFile();
		
		System.out.println(f1.exists());
		
		
		

	}

}

import java.io.*;


public class Filereader2 {

	public static void main(String[] args) throws Exception
	{
		File f = new File("pqr.txt");
		//System.out.println(f.exists());
		
		FileReader fr = new FileReader(f);
		
		char[] ch = new char[(int)f.length()];
		
		fr.read(ch);
		
		
		for(char ele:ch)
		{
			System.out.print(ele);
		}
		
		
		
		
	}

}

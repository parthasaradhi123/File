import java.io.*;


public class Filereader {

	public static void main(String[] args) throws IOException 
	{
		FileReader fr = new FileReader("pqr.txt");
		int i = fr.read();
		
		while(i!=-1)
		{
			System.out.print((char)i);
			i = fr.read();
			//System.out.println(i);
	
		}

	}
}

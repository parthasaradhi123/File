import java.io.*;

public class Bufferedreader {

	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("pqr.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line = br.readLine();
			System.out.println();
		}
		br.close();
	
		

	}

}

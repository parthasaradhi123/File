import java.io.*;

public class Example2 
{

	public static void main(String[] args)throws Exception
	{
		//lmn.txt;
		//par.txt;
		//tuv.txt;
		
		//Which is the best writer that is PrintWriter.
		PrintWriter pw = new PrintWriter("tuv.txt");
		
		//Best Reader we have for character is BufferedReader.
		BufferedReader br = new BufferedReader(new FileReader("lmn.txt"));
		String line = br.readLine();
	
		while(line!=null)
		{
			pw.print(line);
			pw.println();
			line = br.readLine();
		}
		
		
		BufferedReader br1 = new BufferedReader(new FileReader("par.txt"));
		String line2 = br1.readLine();
		
		while(line2!=null)
		{
			pw.print(line2);
			pw.println();
			line2 = br1.readLine();
		}
		
		
		
		pw.flush();
		pw.close();
		br.close();
		br1.close();
		
		
		

	}

}

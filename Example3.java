import java.io.*;


public class Example3 {

	public static void main(String[] args) throws Exception
	{
		//lmn.txt;
		//par.txt;
		//tuv.txt;
		
		PrintWriter pw = new PrintWriter("tuv.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("lmn.txt"));
		String line = br.readLine();
		
		BufferedReader br1 = new BufferedReader(new FileReader("par.txt"));
		String line2 = br1.readLine();
		
		
		while(line!=null||line2!=null)
		{
			if(line!=null)
			{
				pw.print(line);
				pw.println();
				line = br.readLine();
			}
			if(line2!=null)
			{
				pw.print(line2);
				pw.println();
				line2 = br1.readLine();
			}
		}
		
		
		pw.flush();
		br.close();
		br1.close();
		pw.close();
		
		
		

	}

}

import java.io.*;


public class Example4 {

	public static void main(String[] args)throws Exception
	{
		//lmn.txt;
		//par.txt;
		//tuv.txt;
				
		//PrintWriter pw = new PrintWriter("tuv.txt");
		
		
		
		
		
		PrintWriter pw = new PrintWriter("in.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("tuv.txt"));
		
		String line = br.readLine();
		
		while(line!=null)
		{
			boolean b = false;
			
			BufferedReader br2 = new BufferedReader(new FileReader("par.txt"));
			String line2 = br2.readLine();
			while(line2!=null)
			{
				if(line2.equals(line))
				{
					b = true;
					break;
				}
				line2 = br2.readLine();
				
			}
			if(b== false)
			{
					pw.println(line);
				    pw.flush();
			}
			line = br.readLine();
		}
		
		//pw.flush();
	//	pw.close();
		br.close();
		pw.close();
		
		
		
		

	}

}

import java.io.*;


public class Example 
{

	public static void main(String[] args) throws Exception
	{
		 String s = "file.txt";
		 String s1   = "file1.txt";
		 String s2 = "file2.txt";
		 String s3 = "practise";
		 
		 
		 
		 
		 
		 File f3 = new File(s3);
		 f3.mkdir();
		 
		 
		 File f = new File(f3,s);
		 File f1 = new File(f3,s1);
		 File f2 = new File(f3,s2);
		 
		 f.createNewFile();
		 f1.createNewFile();
		 f2.createNewFile();
		 
		 PrintWriter pw = new PrintWriter(f2);
		 
		 BufferedReader br = new BufferedReader(new FileReader(f));
		 String l = br.readLine();
		 
		 while(l!=null)
		 {
			 pw.print(l);
			 l = br.readLine();
		 }
		 
		 
		 BufferedReader br2 = new BufferedReader(new FileReader(f1));
		 String line = br2.readLine();
		 
		 while(line!=null)
		 {
			 pw.print(line);
			 pw.println();
			 line = br2.readLine();
		 }
		 
		 pw.flush();
		 
		 br.close();
		 br2.close();
		 pw.close();
		 
	
		 
		 
		 
		 
		 
		 
		 
		 

	}

}

import java.io.*;

public class Example1 {

	public static void main(String[] args) throws Exception
	{
		String x = "abc.txt";
		String y = "pqr.txt";
		String z = "mno.txt";
		
		File f = new File(x);
		File f1 = new File(y);
		
		//Now My requirment is I wanna copy the data present in f,f1 into the f2.
		File f2 = new File(z);
		
		
		
		f.createNewFile();
		f1.createNewFile();
		f2.createNewFile();
		
		System.out.println(f2.exists());
		
		
		PrintWriter pw = new PrintWriter(f);
		pw.print(true);
		pw.println();
		pw.print('H');
		pw.println();
		pw.print(10.7);
		pw.println();
		pw.print("HELLO");
		pw.println();
		pw.print(12.7f);
		pw.println();
		pw.print(16);
		pw.println();
		pw.println();
		
		
		
		
		PrintWriter pw1 = new PrintWriter(f1);
		pw1.print(false);
		pw1.println();
		pw1.print('I');
		pw1.println();
		pw1.print(11.8);
		pw1.println();
		pw1.print("Hi");
		pw1.println();
		pw1.print(15.7f);
		pw1.println();
		pw1.print(18);
		pw1.println();
		pw1.println();
		
		
		PrintWriter pw2 = new PrintWriter(f2);
		pw2.print("hello");
		
	
		BufferedReader br= new BufferedReader(new FileReader(f));
		
		String line = br.readLine();
		
		 
		 
		
		
		
		
		
		
		
		pw2.flush();
		pw2.close();
		
		
		br.close();
		
		pw.flush();
		pw.close();
		
		pw1.flush();
		pw1.close();
		
		
		
		
		
		
		
		

	}

}

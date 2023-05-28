import java.io.*;


public class Printwriter {

	public static void main(String[] args) throws Exception
	{
		 FileWriter fw = new FileWriter("pqr.txt",true);
		 
		 PrintWriter out = new PrintWriter(fw);
		 
		 
		 
		 out.print(true);
		 out.println();
		 out.print('P');
		 out.println();
		 out.print(19.8);
		 out.println();
		 out.print(126f);
		 out.println();
		 out.print(10);
		 out.println();
		 out.print("hello namaste");
		 out.println();
		 System.out.println("open pqr.txt");
		 
		 out.flush();
		 out.close();
		 
		 

	}

}

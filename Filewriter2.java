import java.io.*;


public class Filewriter2 
{

	public static void main(String[] args) throws IOException 
	{
		 File f = new File("pqr.txt");
		 
		 FileWriter fw = new FileWriter(f,true);
		 //It dont specify only one argument in the constructor then it will always create new object and file
		 //but if you say true then along with file then it will append the data in the existing data.
		 
		 fw.write("\n");
		 fw.write(65);
		 fw.write("\n");
		 
		 fw.write(" :: I am Partha Saradhi Reddy :: ");
		 fw.write("\n");
		 
		 char[] ch = {'A','B','C','D','E','F','G','H','I'};
		 fw.write(ch);
		 fw.write("\n");
		 
		 fw.flush();
		 
		 
		 fw.close();
				 
		 
		 

	}

}

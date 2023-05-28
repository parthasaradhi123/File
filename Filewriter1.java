import java.io.*;

public class Filewriter1 
{

	public static void main(String[] args) throws IOException 
	{
		 //String location= "D:\\IoOperations";
		 
		File f = new File("mnc.text");
		 FileWriter fw = new FileWriter(f,true);
		 
		 fw.write("\n");
		 fw.write(99);
		 fw.write("\n");
		 fw.write("Hi hello namsste");
		 fw.write("\n");
		 char[] c = {'P','Q','R','A','P','Q','R','A'};
		 fw.write(c);
		 fw.write("\n");
		 
		 //as you know we are using the resouce so close the resourse.
		 
		 fw.close();
		 
		 

	}

}

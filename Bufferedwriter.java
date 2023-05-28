import java.io.*;


public class Bufferedwriter {

	public static void main(String[] args) throws Exception
	{
			FileWriter fw = new FileWriter("pqr.txt",true);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(105);
			bw.write("pwSkilss");
			
			bw.newLine();
			
			char[] ch = {'A','B','C','D','E','F','G','H'};
			
			bw.write(ch);
			bw.newLine();
			
			bw.write("Unicorn");
			bw.newLine();
			
			bw.flush();
			bw.close();
			System.out.println("Open the pqr.text to see the changes ");
			

	}

}

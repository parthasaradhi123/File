import java.io.*;

public class Receiver 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("reddy.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Hen h = (Hen)ois.readObject();
		
		System.out.println("The Hen dat is :: "+h.kodi+" , "+h.noOf);
	}

}

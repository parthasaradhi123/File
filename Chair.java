import java.io.*;

class Hen implements Serializable
{
	public Hen()
	{
		
		System.out.println(":: Hen object created ::");
	}
	private static final long serialVersionUID = 2l;

	String kodi = "eggs";
	int noOf = 2;
	
	
}




public class Chair {

	public static void main(String[] args)throws Exception
	{
		Hen h = new Hen();
		
		String s = "reddy.ser";
		
		System.out.println(":: Serialization Started ::");
		FileOutputStream fos = new FileOutputStream(s);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(h);
		System.out.println(":: Serialization ended :: ");
		
		
		
	}

}

import java.io.*;


class Animal 
{
	int j = 2000;
	
//	public Animal()
//	{
//		System.out.println(":: ANimal object created :: ");
//	}
}
class Lion extends Animal implements Serializable
{
	int x =20;
	public Lion()
	{
		//super(450);
		System.out.println(":: Lion Object Created ::");
	}
}

public class Serialization2 
{

	public static void main(String[] args) throws Exception
	{
		String s  = "para.ser";
		
		Lion a = new Lion();
		a.j = 129;
		a.x =420;
		
		System.out.println(":: Serialization Started :: ");
		FileOutputStream fos = new FileOutputStream(s);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		System.out.println(":: Serialization ended :: ");
		
		System.in.read();
		
		System.out.println(":: De-Serialization Started :: ");
		FileInputStream fis = new FileInputStream(s);
		ObjectInputStream ois = new ObjectInputStream(fis);
	    Object obj = ois.readObject();
	    Lion a1 = (Lion)obj;
	    
	    
	    System.out.println(":: De-serialization ended :: ");
	    
	    System.out.println();
	    
	    System.out.println("The values present in lion class are :----> "+a1.j+" , "+a1.x);
	    
	    
	    
	    
	    
		
		
		
		

	}

}

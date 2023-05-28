import java.io.*;


class Partha implements Serializable
{
	Shiva s = new Shiva();
	int m = 100;
	int n = 200;
	
}

class Shiva implements Serializable
{
	Krishna k = new Krishna();
	int x =25;
	int y =30;
	
}

class Krishna implements Serializable
{
	int j =420;
	
}




public class Serialization1 
{

	public static void main(String[] args) throws Exception
	{
		
		Partha p = new Partha();
		System.out.println(p.s.k.j);
		String s = "perk.ser";
		
		System.out.println(":: Serialization started ::");
		FileOutputStream fos = new FileOutputStream(s);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
	
		oos.writeObject(p);
		System.out.println(":: Serialization ended ::");
		
		System.in.read();
		
		FileInputStream fis = new FileInputStream(s);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		Object obj = ois.readObject();
		Partha p1 = null ;
		Shiva s1 = null;
		Krishna k1 = null;
		
		
		if(obj instanceof Partha)
		{
			p1 = (Partha)obj;
			System.out.println(":: At present we have got partha object :: ");
			System.out.println();
		}
		
		if(obj instanceof Shiva)
		{
			s1 = (Shiva)obj;
			System.out.println(":: At present we have got Shiva Object ::");
			System.out.println("The data presents in Shiva Object is :--------> "+p1.s.x+" , "+p1.s.y);

		}
		
		if(obj instanceof Krishna)
		{
			k1 = (Krishna)obj;
			System.out.println(":: At present we have got Krishna Objet :: ");
			System.out.println("The data presents in Krishna Object is :--------> "+k1.j);

		}
		
		
		
		System.out.println("DE-Serialization ended");
		System.out.println("De-Serialization ended");
		System.out.println("The data present in Partha object is :-------> "+p1.m+" , "+p1.n);

		
		
		
	}

}

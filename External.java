import java.io.*;


class Demo implements Externalizable
{
	String na;
	int i;
	int j;
	int k;
	
	public Demo()
	{
		System.out.println(":: Demo Objectis created ::");
	}
	
	public Demo(String na,int i,int j,int k)
	{
		this.na = na;
		this.i =i;
		this.j = j;
		this.k = k;
		
	}
	
	
	public void writeExternal(ObjectOutput oo) throws IOException
	{
		System.out.println(":: writeExternal() is called for serialization ::");
		oo.writeObject(na);
		oo.writeInt(i);
		oo.writeInt(j);
		
		
	}
	
	public void readExternal(ObjectInput oi) throws IOException,ClassNotFoundException
	{
		System.out.println(":: readExternal() is called for De-serialization :: ");
		na = (String)oi.readObject();
		i = (int)oi.readInt();
		j = (int)oi.readInt();
	}
}

public class External {

	public static void main(String[] args) throws Exception
	{
       String s  = "para.ser";
		
		 Demo d = new Demo("partha",20,30,40);
		 
		
		System.out.println(":: Externalization Started :: ");
		FileOutputStream fos = new FileOutputStream(s);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println(":: Externalization ended :: ");
		
		System.in.read();
		
		System.out.println(":: De-Externalization Started :: ");
		FileInputStream fis = new FileInputStream(s);
		ObjectInputStream ois = new ObjectInputStream(fis);
	    Object obj = ois.readObject();
	    
	    Demo d1 = (Demo)obj;
	    
	    System.out.println(":: De-Externalization ended :: ");
	    
	    System.out.println();
	    
	    System.out.println("The values present in lion class are :----> " +d1.na+","+d1.i+","+d1.j);

	}

}

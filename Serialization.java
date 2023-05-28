import java.io.*;

class Cat implements Serializable
{
	static
	{
		System.out.println(":: sI Execute at the class loading time ::");
	}
	
	public Cat()
	{
		System.out.println("::  I am a consructor ::");
	}
	
	
	//if you make any variable transient then that variable will never participate in serialization.
	transient int x =10;
	int y = 20;


	
	
}

class Dog implements Serializable
{
	public Dog()
	{
		System.out.println(":: Dog Object is created ::");
	}
	
	final transient int m = 34;
	static transient int n = 75;
	
}

class Mouse implements Serializable
{
	public Mouse()
	{
		System.out.println(" :: The Mouse Object is created ::");
	}
	
	int p = 100;
	int q =200;
	
}



public class Serialization {

	public static void main(String[] args) throws Exception
	{
		Cat c = new Cat();
		Dog d = new Dog();
		Mouse m = new Mouse();
		
		
		System.out.println(":: Serialization has started ::");
		
		//First before sending the object through network first we need aplace or area to save that object
		// so create a file 
		
		String s = "pex.ser";
		FileOutputStream fos = new FileOutputStream(s);
		
		//Now its time for us to establish the connection between the object and file and send the object to file
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//now write something inside the file.
		oos.writeObject(c);
		oos.writeObject(d);
		oos.writeObject(m);
		
		System.out.println(":: Serialization is done ::");
	
		System.in.read();
		
		System.out.println(":: De-Serialization Started :: ");
		//Now our object data is in the file now we should get back it into object form.
		
		FileInputStream fis = new FileInputStream("pex.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		Cat c1 = (Cat)obj;
		
		Object obj1 = ois.readObject();
		Dog d1 = (Dog)obj1;
		
		Object obj2 = ois.readObject();
		Mouse m1 = (Mouse)obj2;
		
		
		Object obj3 = ois.readObject();
		
		
		System.out.println(":: De-Serialization ended :: ");
		
		System.out.println();
		
		System.out.println("Cat variable values are : ----> : "+c1.x+","+c1.y);
		System.out.println("Dog variable values are : ----> : "+d1.m+","+d1.n);
		System.out.println("Mouse variable values are : ----> : "+m1.p+","+m1.q);
		
		
		

		
		
		
		
		
		
		

	}

}

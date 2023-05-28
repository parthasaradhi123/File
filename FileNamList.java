import java.io.*;
/*
 * createNewFile()
 * created mkdir()
 * length()
 * isFile()
 * isDirectory()
 * exists()
 * (file,fileName);
 * list()
 * 
 * endsWith is a method on String Object.
 * 
 * 
 */


public class FileNamList {

	public static void main(String[] args) 
	{
		int dirCount=0;
		int fileCount =0;
		int jpgCount =0;
		int clsCount=0;
		int zipCount=0;
		
		
		String location = "D:\\Java_Full_stack_developer";
		
		File f = new File(location);
		String[] s = f.list();
		
		for(String ele:s)
		{
			 File f2 = new File(f,ele);
			 if(f2.isDirectory())
			 {
				 dirCount++;
			 }
			 if(f2.isFile())
			 {
				 if(ele.endsWith(".pdf"))
				 {
					 jpgCount++;
				 }
				 if(ele.endsWith(".class"))
				 {
					 clsCount++;
				 }
				 if(ele.endsWith(".zip"))
				 {
					 zipCount++;
				 }
				 fileCount++;
			 }
			 
		}
		
		System.out.println("The total number of directories  are :: "+dirCount);
		System.out.println("The total number of files are :: "+fileCount);
		System.out.println("The total number of .jpg  are :: "+jpgCount);
		System.out.println("The total number of .class are :: "+clsCount);
		System.out.println("The total number of .zip are :: "+zipCount );

	}
	

}



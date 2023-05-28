import java.io.*;


public class Example5 {

	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("tuv.txt"));
		
		String line = br.readLine();
		
		int max =0;
		String result ="";
		
		while(line!=null)
		{
			int i = line.length();
			if(max<i)
			{
				max=i;
				result = line;
			}
			line = br.readLine();
		}
		System.out.println("The highest lengh in the file is :: "+max+" :: "+result);
		
		
		br.close();
		
		

	}

}

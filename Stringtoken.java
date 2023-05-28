import java.util.*;

public class Stringtoken {

	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("Partha$Sar,adhi$Re,ddy",",");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
	}

}

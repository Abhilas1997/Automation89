package JavaArray;

import java.util.HashSet;

public class SecondDuplicateNumber {

	public static void main(String[] args) {
		int [] a= {22,12,3343,2,33,22,35,12,2};
		
		
		HashSet st=new HashSet();
		
		for(int i=0;i<a.length; i++)
		{
			for(int j=0;j<a.length; j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					st.add(a[i]);
					
				}
			
			}
		}

Object[] b=st.toArray();

for(int i=0; i<b.length; i++)
{
	
	if(i==2)
	{
		System.out.print(b[i]);
	}
}
	}

}

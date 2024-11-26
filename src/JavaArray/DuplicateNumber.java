package JavaArray;

public class DuplicateNumber {

	public static void main(String[] args) 
	{
	int [] a= {22,12,3343,33,22,35};
	for(int i=0;i<a.length; i++)
	{
		for(int j=0;j<a.length; j++)
		{
			if(a[i]==a[j] && i!=j)
			{
				System.out.print(a[i]);
			}
		break;
		}
	}

	}

}


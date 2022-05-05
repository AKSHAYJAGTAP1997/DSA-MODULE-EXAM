import java.util.*;

class Sorting
{
	public static void Sorted(int a1[])
	{
		int length=a1.length;
		int element=a1[length-1];
		for(int i= length-2;i>=0;i--)
		{
			if(a1[i]> element)
			{
				a1[i+1]=a1[i];
				printArray(a1);
				
			}
			else
			{
				a1[i+1]=element;
				printArray(a1);
				break;
			}
			if(i==0 && (a1[i]>element))
			{
				a1[i]=element;
				printArray(a1);
			}
		}
		

	}

     public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a1[]=new int[n];
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
	}
	
	Sorted(a1);
	sc.close();
	
}
	private  static void printArray(int[] a1)
		{
			for(int n:a1)
			{
				System.out.print(n+" ");
			}
			System.out.println(" ");
		}



		
	}
	
	

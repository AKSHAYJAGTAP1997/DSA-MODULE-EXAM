import java.util.*;


class TwoStacks1
{
	int[] a;
	int size;
	int Top1,Top2;
	TwoStacks1(int x)
	{
		size=x;
		a=new int[x];
		Top1=x/2+1;
		Top2=x/2;
		
		
	}
	
	// for pushing in first stack
	
	void push1(int z)
	{
		if(Top1>0)
		{
		Top1--;
		a[Top1]=z;		
		}
		
		else
		{
		//System.out.println("Stack overflow"+z);
        return;		
		}
	}
	
	// for pushing in second stack
	
	void push2(int x)
	{
		if(Top2<size-1)
		{
			Top2++;
			a[Top2]=x;
			
		}
		else
		{
			//System.out.println("Stack overflow"+x);
			return;
		}
		
		
		
	}
	
		// pop from first stack
		int pop1()
		{
			if(Top1<=size/2)
			{
				int x=a[Top1];
				Top1++;
				return x;
			}
			
			else
			{
				System.out.println("Stack underflow");
				System.exit(1);
				
			}
			return 0;
		}
     //  pop from seconnd stack
	 int pop2()
	 {
		 if(Top2>=(size/2)+1)
		 {
			 int x=a[Top2--];
			 Top2--;
			 return x;
		 }
		 else
		 {
			 System.out.println("Stack underflow");
			 System.exit(1);
		 }
		 return 1;
		 
		 
		 
	 }
}


class TwoStacks
{
	public static void main(String[] args)
	{
		TwoStacks1 sc = new TwoStacks1(6);
		
		sc.push1(5);
		sc.push2(10);
		sc.push2(40);
		sc.push2(15);
		sc.push1(11);
		sc.push2(7);
		
		System.out.println("Popped element from stack1 is "+sc.pop1());
		
		System.out.println("Popped element from stack2 is "+sc.pop2());
		
		
		
		
	}
	
}
		
	
	
	
	
	


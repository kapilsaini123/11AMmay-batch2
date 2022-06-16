package xyz2;

public class student3 
{
	public int sum(int a,int b)
	  {
		  int c;
		  c=a+b;
		  System.out.println("sum result is "+c);
		  return c; // returing result of a+b
	  }
	  public int sub(int x,int y)
	  {
		  int z;
		  z=x-y;
		  System.out.println("sub result is "+z);
		  return z;
	  }
	  public void multi(int x1,int x2)
	  {
		  int x3;
		  x3=x1*x2;
		  System.out.println("final result is "+x3);
	  }
	  public static void main(String[] args)
	  {
		student3 ob=new student3();
		int sumresult=ob.sum(10, 2);
		int subresult=ob.sub(10, 2);
		ob.multi(sumresult, subresult);
	  }
	  
	  }

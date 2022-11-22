package Type1;

public class Prog8 {
	public static void main(String[]args) 
	{
		int marks[]=new int[] {10,20,30,40};
		System.out.println(marks.length);
		for(int i=0; i<40;i++) 
		{
		 System.out.println(marks[i]);	
		}
		for(int marks1:marks) 
		{
			System.out.println(marks);
		}
	}

}

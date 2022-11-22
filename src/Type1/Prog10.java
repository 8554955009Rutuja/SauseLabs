package Type1;

public class Prog10 {
	public static void main(String[]args) 
	{
		String name[][] =new String[2][2];
		name[0][0]="kya";
		name[0][1]="jam";
		name[1][0]="neeya";
		name[1][1]="riya";
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<2; j++)
			{
				System.out.println(name[i][j]+"");
			}
			System.out.println();
		}



	}

}

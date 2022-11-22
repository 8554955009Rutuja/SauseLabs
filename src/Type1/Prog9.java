package Type1;

public class Prog9 {
	public static void main(String[]args)
	{
	 String value[][]	=new String[2][2];
	 value[0][0]="Rita";
	 value[0][1]="Jiya";
	 value[1][0]="Omi";
	 value[1][1]="Sam";
	 for(int i=0;i<2;i++) 
	 {
		 for(int j=0;j<2; j++)
		 {
			 System.out.println(value[i][j] +" ") ;
		 }
		 System.out.println();
	 }
	 
	}

}

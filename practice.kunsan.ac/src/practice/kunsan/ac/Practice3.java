package practice.kunsan.ac;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				if(j == 1) System.out.println("** " + i + "�� **");
				
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
	}

}

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print the Number in Forward Format");
		int k=1;
		for(int i=0;i<4;i++)
		{
			for (int j=1;j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		System.out.println("Print the Number in Reverse Format");
		int N=1;
		for(int i=1;i<5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(N);
				System.out.print("\t");
				N++;
			}
			System.out.println("");
		}
		System.out.println("Print the Number in Reverse Format");
		int N1=1;
		for(int i=1;i<5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(N1);
				System.out.print("\t");
				N1++;
			}
			System.out.println("");
		}
	}
}

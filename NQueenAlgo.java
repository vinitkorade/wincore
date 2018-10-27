import java.util.*;
/*Contributed by (Vinit Korade)*/

public class NQueenAlgo 
{
	int no;
	int placed[], matrix[][];
	public Scanner sc = new Scanner(System.in);
	public NQueenAlgo()
	{
		System.out.print("Enter N:- ");
		no = sc.nextInt();
		placed = new int[no];
		matrix = new int[no][no];
		for(int i=0;i<no;i++)
		{
			placed[i]=-1;
		}
		initBoard();
		algo(0,no);
	}
	public void initBoard()
	{
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				matrix[i][j]=0;
			}
		}
	}
	public void algo(int k, int n )
	{
		for(int i=0;i<n;i++)
		{
			if (place(k,i))
			{
				placed[k] = i;
				
				if(k==(n-1))
				{
					System.out.println();
					show();
				}
				else
				{
					algo(k+1,n);
				}
			}
		}
	}
	public boolean place(int k, int i)
	{
		for(int j=0;j<k;j++)
		{
			if(placed[j]==i || Math.abs(placed[j]-i)==Math.abs(j-k) )
			{
				return false;
			}
		}
		return true;
	}
	public void show()
	{
		System.out.println();
		for(int i=0;i<no;i++)
		{
			System.out.print("\t"+placed[i]);
		}	
		for(int i=0;i<no;i++)
		{
			System.out.println();
			for(int j=0;j<no;j++)
			{
				if(j==placed[i])
				{
					matrix[i][j]=1;
				}
				System.out.print("\t"+matrix[i][j]);
			}
		}
		initBoard();
	}
}
/*Contributed by (Wincore)*/
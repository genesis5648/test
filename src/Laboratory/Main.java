package Laboratory;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int line = sc.nextInt();
	int column = sc.nextInt();
	
	int array[][] = new int[line][column];
	int zeroCount=0;
	int barusCount=0;
	
	for(int i=0;i<line;i++)
		for(int j=0;j<column;j++)
		{
			array[i][j] = sc.nextInt();
			if(array[i][j]==0)
				zeroCount++;
			if(array[i][j]==2)
				barusCount++;
		}
	
	int zeroArray[][] = new int[zeroCount][2];
	int barusArray[][] = new int[barusCount][2];
	zeroCount=0;
	barusCount=0;
	
	for(int i=0;i<line;i++)
		for(int j=0;j<column;j++)
		{
			if(array[i][j]==0)
			{
				zeroArray[zeroCount][0] = i;
				zeroArray[zeroCount++][1] = j;	
			}
			
		}
	
	int tempArray[][] = new int[line][column];
	tempArray = array.clone();
	
	//selecting three bars
	for(int i=0;i<zeroCount-2;i++)
		for(int j=i+1;j<zeroCount-1;j++)
			for(int k=+1;k<zeroCount;k++)
			{
				//int[][] threebar = new int[3][2];
				tempArray[zeroArray[i][0]][zeroArray[i][1]]=0;
				tempArray[zeroArray[j][0]][zeroArray[j][1]]=0;
				tempArray[zeroArray[k][0]][zeroArray[k][1]]=0;
				
				
				tempArray[][]
				
				
			}
	
	
	for(int i=0;i<line;i++)
		for(int j=0;j<column;j++)	
		{
			if(array[i][j])
		}
	

	}

}


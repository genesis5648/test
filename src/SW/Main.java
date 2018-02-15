package SW;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		int[] temp=new int[3];		
		temp[0]=0;
		temp[0]=1;
		
		for(int i=0;i<=num-2;i++)
		{			
			temp[2] = temp[0] + temp[1];
			temp[0] = temp[1];
			temp[1] = temp[2];
		}
		System.out.println(temp[2]);
		
	}
}



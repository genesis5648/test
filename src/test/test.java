package test;

public class test {

	public static void main(String[] args) {
		int numTask = 3;
		int[] T = {20,15,10};
		int[] Cr= {0,1,1};
		int[] CL = {3,3,2};
		int[] CH = {3,4,4};

		for(int i=0;i<numTask;i++)
		{
			System.out.print("Cr["+i+"]:"+Cr[i]+"\t");
			System.out.print("T["+i+"]:"+T[i]+"\t");			
			System.out.print("CL["+i+"]:"+CL[i]+"\t");
			System.out.println("CH["+i+"]:"+CH[i]+"\t");
		}
		
		double Ull = 0;
		
		double Uhl = 0; 
		double Uhh = 0;
		
		for(int i=0;i<numTask;i++)
		{
			if(Cr[i]==0)
				Ull+=(CL[i]/(double)T[i]);	//low tasks' utilization summation
			else
			{
				Uhl+=(CL[i]/(double)T[i]);	//high tasks' low exec utilization summation
				Uhh+=(CH[i]/(double)T[i]);	//high tasks' high exec utilization summation
			}
		}		
		
		System.out.println("\nUll:"+Ull);
		System.out.println("Uhl:"+Uhl);
		System.out.println("Uhh:"+Uhh);
		System.out.println();
		System.out.println("VD left condition(Uhl/(1-Ull))	:\t"+Uhl/(1-Ull));
		System.out.println("VD right condition((1-Uhh)/Ull)	:\t"+(1-Uhh)/Ull);
				
		if(Uhl/(1-Ull)<=(1-Uhh)/Ull)
			System.out.println("\nMC-schedulable by EDF-VD");
		
		double x=0.8;
		System.out.println("\nchosen x:\t"+x);
		
		double U = Ull+Uhl/x;
		double p=0;
		
		System.out.println("\ntotal U in low Mode:\t"+U);
		double[] tempT = new double[3];
		
		for(int i=0;i<numTask;i++) //low mode slack calcuation
		{
			
			if(Cr[i]==1)
				tempT[i] = (int)(T[i]*x);
			else 
				tempT[i] = T[i];
			System.out.println("new T:\t"+tempT[i]);
		}
		
		for(int i=0;i<numTask-1;i++) //low mode slack calcuation
		{
			if(Cr[i]==0)
				U-=CL[i]/tempT[i];
			else
				U-=CL[i]/tempT[i];
			
			System.out.println("\n U-:\t"+U);
			//int qi = (int)(Math.max(0, CH[i]-(int)((1-U)*(tempT[i]-tempT[numTask-1]))));
			double qi = (Math.max(0, CH[i]-((1-U)*(tempT[i]-tempT[numTask-1]))));
			System.out.println("\navailable slots between "+tempT[i]+" and "+tempT[numTask-1]+"\t"+(1-U)*(tempT[i]-tempT[numTask-1]));
			U=U+(CH[i]-qi)/(double)(tempT[i]-tempT[numTask-1]);			
			p+=qi;
			System.out.println("cumulated U:\t"+U);
			System.out.println("qi:\t"+qi);
			System.out.println("current p:\t"+p);
		}
		double S = tempT[numTask-1] - p;
		System.out.println("\nS without task1:\t"+S);
		System.out.println("actual S:\t"+(S-CH[numTask-1]));
		
		
	}
	

}

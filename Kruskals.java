            // Program to Demonstrate Kruskals Algorithm


import java.util.Scanner;
import java.io.*;

 public class Kruskals
 {
   	int u,v;
	int[] parent = new int[10];
 	
	public int find(int m)		//Function
        {
 		int p = m;
 		while(parent[p]!=p)
		{
               		p = parent[p];
		}
 		return p;
	}

	public void union(int i,int j)		//Fuction
        {
 		parent[v] = u;
        }
           
        public void  krkl(int[][] a,int n)       //Core Algo Fuction
        {
                int min,i,j;
		int min_cost=0,
	        int nv=1;
                
		for(i=0;i<n;i++)
                {
                        parent[i]=i;
                }

                while(nv<=n-1)
                {
                        min = 999;
                        for(i=0;i<n;i++)
                        {
                                for(j=0;j<n;j++)
                                {
                                        if(a[i][j]<min)
                                        {
                                                min = a[i][j];
                                                u=i;
                                                v=j;
                                        }
                                }
                        }
                        
			i = find(u);               //Call to find func                
                        j = find(v);		 //Call to find fucc
                        
			if(i!=j)
                        {
                                                                                                                     
                               for(j=0;j<n;j++)
                                {
                                        if(a[i][j]<min)
                                        {
                                                min = a[i][j];
                                                u=i;
                                                v=j;
                                        }
                                }
                        
			} 
			i = find(u);		//find fucn
                        j = find(v);              //find fucn
		       		
                       	if(i!=j)
                       	{
                               	System.out.printf("There is edge between %d - %d\n",u,v);
                               	union(u,v);		//union func call
                               	min_cost += min;
                               	nv = nv + 1;
                     	}

                       	a[u][v] = 999;
               	}//While loop_end
         
	System.out.println("Cost:"+min_cost);
    }
        
	
    	public static void main(String[] args)
    	{
     		int n,i,j;
        	int[][] a = new int[10][10];
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter number of vertices");
        	n = sc.nextInt();
       		Kruskal k = new Kruskal();
        	System.out.println("Enter the adjacency matrix");
        	System.out.println("Enter 999 for no connection and weight for connection");
        	
		for(i=0;i<n;i++)
                {
                        for(j=0;j<n;j++)
                        {
                                a[i][j] = sc.nextInt();
                        }
                }
                k.krkl(a,n); 		//k is object.uses krkl method in Kruskals class
    	}
}
     

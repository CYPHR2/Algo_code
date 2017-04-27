            // Program to Demonstrate Kruskals Algorithm


import java.util.Scanner;
import java.io.*;

 public class Kruskals
 {
   	int u,v;
	int[] parent = new int[10];
 	
	int find(int m)		//Function
        {
 		int p = m;
 		while(parent[p]!=p)
		{
               		p = parent[p];
		}
 		return p;
	}
	void union(int i,int j)		//Fuction
        {
 		parent[v] = u;
        }
        void krkl(int[][]    
     

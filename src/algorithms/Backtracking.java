package algorithms;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Backtracking {
	/*
	 * Take a look at http://www.cs.uoi.gr/~pvassil/downloads/GraphDistance/maxCommonSubgraph_McGregor_1982.pdf , page 25
	 */
	public static int is_there_unmarked_digit(Set<Integer>C,int[]dd){
		for(int i=0;i<dd.length;i++) {
			if (dd[i]==0 && !C.contains(i)) return i;
		}
		return -1;
	}

	public static void removeCurrentConstraints(Set<Integer> C,int d[]) {
		for (int i=0;i<d.length;i++) {
			if (d[i]==1) 
				C.remove(i);		  
		}
	}

	public static void run(int n, boolean print) {
		//		http://www.cs.uoi.gr/~pvassil/downloads/GraphDistance/maxCommonSubgraph_McGregor_1982.pdf
		int count=0;
		Date start=new Date();

/*		Basic Backtracking search algorithm from http://www.cs.uoi.gr/~pvassil/downloads/GraphDistance/maxCommonSubgraph_McGregor_1982.pdf , page 25
  		
		int[][] d=new int[n+1][10];
		int[]x=new int[n+1];
		Arrays.fill(x, 0);
		
		int i=1;
		Arrays.fill(d[1],0);
  		do {
			int unmarked=-1;
			if ((unmarked=is_there_unmarked_digit(d[i]))!=-1) {		// in basic search there is no Constraints checking in function is_there_unmarked_digit()		
				d[i][unmarked]=1;
				x[i]=unmarked;
				if (i==n) {
					count++;
					//System.out.println(Arrays.toString(x));
				} else {
					i+=1;
					Arrays.fill(d[i], 0);
				}
			} else 
				i--;
		} while(i>0);
*/	
		int[][] d=new int[n+1][10];
		int[]x=new int[n];
		Arrays.fill(x, 0);
		
		int i=1;
		Arrays.fill(d[1],0);
		Set<Integer>C=new HashSet<Integer>();
		
		do {
		int unmarked=-1;
		if ((unmarked=is_there_unmarked_digit(C,d[i]))!=-1) {	//check here constraints
			d[i][unmarked]=1;
			x[i-1]=unmarked;
			C.add(unmarked);
			if (i==n) {
				count++;
				if (print)
					System.out.println(Arrays.toString(x));
			} else {
				i+=1;
				Arrays.fill(d[i], 0);		//put here constraints
			}
		} else {
			i--;
			if (i>0) {
				int current_value=x[i-1];
				d[i+1][current_value]=1;
				removeCurrentConstraints(C,d[i+1]);
			} else {
				//System.out.println("Execution has been completed.");
			}
		}
	} while(i>0);
		Date end=new Date();
		System.out.println(String.format("Execution time is:%d. Found solutions: %d",end.getTime()-start.getTime(),count));
	}

	public static final void main(String [] args) {
		run(Integer.valueOf(args[0]), true);
	}
}

package algorithms;

import java.util.Date;

import algorithms.ConstraintDifferentLetters;

public class Bruteforce {
	public static void run() {
		Date start=new Date();
		int count=0;
		for (int i1=0; i1<10; i1++) 
			for (int i2=0; i2<10; i2++) 
				for (int i3=0; i3<10; i3++) 
					for (int i4=0; i4<10; i4++) 
						for (int i5=0; i5<10; i5++) 
							for (int i6=0; i6<10; i6++) 
								for (int i7=0; i7<10; i7++) 
									for (int i8=0; i8<10; i8++) 
										for (int i9=0; i9<10; i9++) {
											if (ConstraintDifferentLetters.isSatisfied(
													new int[]{i1,i2,i3,i4,i5,i6,i7,i8,i9})) {
												count++;
											}	
										}
		Date end=new Date();
		System.out.println(String.format("Execution time:%d msecs, found solutions: %d",end.getTime()-start.getTime(), count));
		
		//Execution time:76 403 msecs, found solutions: 3 628 800  10 000 000 000
		
	}
	public static final void main(String args[]) {
		run();
	}
}

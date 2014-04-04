package algorithms;

public class ConstraintDifferentLetters {

	public static boolean isSatisfied(int[] word) {
		boolean ret = true;
		for (int inx=0; inx<word.length-1; inx++) 
			for (int inx2=inx+1; inx2<word.length;inx2++)
			if (word[inx]==word[inx2])
				ret = false;
		return ret;
	}

}

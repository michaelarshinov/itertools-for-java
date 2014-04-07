itertools-for-java
==================
**non-recursive** library to find permutations, combinations, product 

~~Both Algorithms are searching for the permutation without repetition of n different digits
i.e. n=3
[0, 1, 2]
[0, 1, 3]
...
[0, 2, 9]
[0, 3, 1]
[0, 3, 2]
...
[9, 8, 6]
[9, 8, 7]
 
To compare Backtracking and Linear Algorithms you can run "ant test" in your console (on my machine it works a minute).~~

*ant jar* creates a library and puts it to the *release* folder  
* Release 0.0.2

Added *Backtracking.permutations* and *Backtracking.product* methods

```
	String[] p_without_repetitions = Backtracking.permutations(new String[]{"A","B","C","D"}, 2);
	System.out.println(Arrays.toString(p_without_repetitions));
	String[] p_with_repetitions = Backtracking.product(new String[]{"A","B","C","D"}, 2);
	System.out.println(Arrays.toString(p_with_repetitions));
	String[] combinations = combinations(new String[]{"A","B","C","D"}, 2);
	System.out.println(Arrays.toString(combinations));
```

* Release 0.0.3

Added *Backtracking.combinations* and *Backtracking.is_sorted* methods


                   Method                       |	                Results 
------------------------------------------------|--------------------------------------------------
permutations(new String[]{"A","B","C","D"}, 2);	| [ A B ,  A C ,  A D ,  B A ,  B C ,  B D ,
                                                |  C A ,  C B ,  C D ,  D A ,  D B ,  D C ]
                                                |                                                
product(new String[]{"A","B","C","D"}, 2);      | [ A A ,  A B ,  A C ,  A D , B A ,  B B ,  B C ,  B D ,
                                                |   C A ,  C B ,  C C ,  C D , D A ,  D B ,  D C ,  D D ]
                                                |  
combinations(new String[]{"A","B","C","D"}, 2); | [ A B ,  A C ,  A D ,  B C ,  B D ,  C D ]



/*
	Find the 50th fibonacci number. 
*/

import java.util.*;

class Fibo
{
	Long find(int n,HashMap<Integer,Long> memo)
	{
		if(memo.containsKey(n)) return memo.get(n);
		if(1==n || 2==n) return 1l;
		memo.put(n, find(n-1,memo)+find(n-2,memo) );
		return memo.get(n);
	}
}

class Fibonacci
{
	public static void main(String[] args)
	{
		HashMap<Integer,Long> memo = new HashMap<>();
		Fibo f = new Fibo();
		System.out.println(f.find(50,memo));
	}
}

/*
	Find all possible paths so that we can traval from start to the end point of the 2D Grid
*/

import java.util.*;

class Grid
{
    int find(int n,int m, HashMap<String,Integer> memo)
    {
        if(memo.containsKey(n+","+m))  return memo.get(n+","+m);
        if(1==n && 1==m)    return 1;
        if(0==n || 0==m)    return 0;

        memo.put((n+","+m), find(n-1,m,memo)+find(n,m-1,memo));
        return memo.get(n+","+m);
    }
}

class Grid2D
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> memo = new HashMap<>();
        Grid g = new Grid();
        System.out.println(g.find(2,3,memo));
    }
}
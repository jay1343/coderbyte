/*
	given target and an array of integers.
	by adding integers in array find if we can get target or not.
	consider that you can use one value multiple times.
*/

/*
	given target and an array of integers.
	by adding integers in array find if we can get target or not.
	consider that you can use one value multiple times.
*/

import java.util.*;

class Sum
{
    boolean find(int target,int[] arr, Set memo)
    {
        if(memo.contains(target) || 0==target) return true;
        if(target<0) return false;

        for(Integer num : arr)
        {
            if(find(target-num , arr,memo) == true) 
            {
                return true;
            }
        }

        return false;
    }
}

class CanSum
{
    public static void main(String[] args)
    {
        Set<Integer> memo = new HashSet<>();
        int[] arr = new int[] {3,4,6,8,9};
        for(int n : arr)
        {
            memo.add(n);
        }
        Sum s = new Sum();
        System.out.println(s.find(7,arr,memo));
    }
}

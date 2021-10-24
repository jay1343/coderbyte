import java.util.*;

class Sum
{
    boolean find(int n,int[] m)
    {
        Set<Integer> memo = new HashSet<>();

        for(Integer num : m)
        {
            memo.add(num);
        }
        if(memo.contains(n) || n==0) return true;
        if(n<0) return false;

        for(Integer num : memo)
        {
            if(find(n-num , m) == true) return true;
        }

        return false;
    }
}

class CanSum
{
    public static void main(String[] args)
    {
        
        Sum s = new Sum();
        System.out.println(s.find(1025,new int[] {3,4,6,8,9}));
    }
}
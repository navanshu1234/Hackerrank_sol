public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int n = a.size();
        int m = b.size();
        int x = n>m? n:m;
        int ap = 0,bp = 0;
        for(int i = 0;i<x;i++)
        {
            if(a.get(i)>b.get(i))
            {
              ap++  ;
            }
            else{
                if(a.get(i) != b.get(i))
                {
                    bp++;
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(ap);
        ans.add(bp);
        return ans;
    }

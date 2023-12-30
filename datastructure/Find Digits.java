public static int findDigits(int n) {
        int r  = n;
        int rem;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        while(r != 0)
        {
            rem = r%10;
            ar.add(rem);
            r = r/10;
        }
        int count = 0;
        for(int i=0;i<ar.size();i++)
        {if(ar.get(i) != 0){
            if(n%ar.get(i) == 0)
            {
                count++;
            }
        }
        }
        return count;

    }

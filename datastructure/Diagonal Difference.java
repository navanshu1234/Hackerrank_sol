public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        int n = arr.size();
        for(int i =0;i<arr.size();i++)
        {
            sum1 = sum1 + arr.get(i).get(i);
            sum2 = sum2 + arr.get(i).get(n-1-i);
        }
        return Math.abs(sum1-sum2);

    }

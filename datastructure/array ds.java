public static List<Integer> reverseArray(List<Integer> arr) {
    // Write your code here
    int temp = 0;
    int n = arr.size();
     for(int i = 0; i<arr.size()/2;i++)
     {
         temp = arr.get(n-i-1);
         arr.set(n-i-1,arr.get(i));
         arr.set(i,temp);
         
     }
     return arr;
    }

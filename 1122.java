class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
       HashMap<Integer,Integer> map=new HashMap<>();
        
        Arrays.sort(arr1);    //as we want the elements of arr1 also to be sorted in final answer

        for(int i:arr1) map.put(i,map.getOrDefault(i,0)+1);
        
        int ans[]=new int[arr1.length];
        
        int j=0;
        for(int i:arr2){
          while(map.get(i)!=0){
              ans[j]=i;
              map.put(i,map.get(i)-1);
              j++;
          }  
        }
        
        for(int i: arr1){
            if(map.get(i)!=0){
                ans[j]=i;
                j++;
            }
        }
        
        return ans;
    }
}


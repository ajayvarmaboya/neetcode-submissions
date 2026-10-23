class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        int []res=new int[k];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>>entries=new ArrayList<>(map.entrySet());

        entries.sort((a,b)->b.getValue()-a.getValue());

        for(int i=0;i<k;i++){
            res[i]=entries.get(i).getKey();
        }
        return res;
        
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        // pq.addAll(map.values());
        int [] res = new int [k];
        int j = 0;
        for(int key : map.keySet()){
            pq.add(key);
        while(pq.size()>k){
            pq.poll();
        }
        }
        while(pq.size()>0){
            res[j++] = pq.poll();
        }
        return res;
    }
}

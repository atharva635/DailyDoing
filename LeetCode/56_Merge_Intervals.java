
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> list =  new ArrayList<>();
        for(int []k : intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1]<k[0]){
                list.add(k);
            }
            else{
                list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1],k[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
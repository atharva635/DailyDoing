class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        int h = strs.length;
        for (int i=0;i<h;i++){
            String j = strs[i];
            char [] arr = j.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(j);
        }  
        return new ArrayList<>(map.values());
    }
}
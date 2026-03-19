class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backin(nums,0,new ArrayList<>(), list);
        return list;
    }

        void backin(int[] nums, int index ,List<Integer> subset,List<List<Integer>> list){
            list.add(new ArrayList<>(subset));
            for(int i=index;i<nums.length;i++){
                subset.add(nums[i]);
                backin(nums,i+1,subset,list);
                subset.remove(subset.size()-1);
            }

        }


        
    }

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l1 = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max)
                max = candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies<max)
                l1.add(false);
            else
                l1.add(true);
        }
        return l1;
    }
}
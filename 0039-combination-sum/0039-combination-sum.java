class Solution {
    public List<List<Integer>> combinationSum(int[] c, int target) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        int sum=0;
        solve(c,sum,a,target,l,0);
        return l;  
    }
    public void solve(int[] c,int sum, List<Integer> a,int target,List<List<Integer>> l,int s){
        if(sum==target){
            l.add(new ArrayList<>(a));
            return;
        } 
        if(sum>target){
            return;
        }
        for(int i=s;i<c.length;i++){
            sum+=c[i];
            a.add(c[i]);
            solve(c,sum,a,target,l,i);
            a.remove(a.size()-1);
            sum-=c[i];
        }
    }
}
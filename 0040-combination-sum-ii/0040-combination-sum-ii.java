class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int target) {
        Arrays.sort(c);
        List<List<Integer>> l=new ArrayList<>();
        solve(c,target,l,new ArrayList<>(),0);
        return l;
    }
    public void solve(int c[],int target, List<List<Integer>> l,List<Integer> a,int inx){
        if(target==0){
            l.add(new ArrayList<>(a));
            return; 
        }
        if(target<0){
            return;
        }
        for(int i=inx;i<c.length;i++){
            if(i>inx && c[i]==c[i-1]){
                continue;
            }
            if(c[i]>target){
                break;
            }
            a.add(c[i]);
            solve(c,target-c[i],l,a,i+1);
            a.remove(a.size()-1);
        }
    }
}
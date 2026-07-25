class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb=new StringBuilder();
        int fact=1;
        for(int i=1;i<=n;i++){
            sb.append(i);
            if(i<n){
                fact*=i;
            }
        }
        StringBuilder res=new StringBuilder();
        k--;
        while(sb.length()>0){
            int inx=k/fact;
            res.append(sb.charAt(inx));
            sb.deleteCharAt(inx);
            k=k%fact;
            if (sb.length() > 0) {
                fact/=sb.length();
            }
        }
        return res.toString();
    }
}
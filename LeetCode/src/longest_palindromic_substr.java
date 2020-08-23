class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0)
        {
            return "";
        }
        int arr[][]=new int[s.length()][s.length()];
        int len=s.length();
        for(int i=0;i<s.length();i++)
        {
            arr[i][i]=1;
        }
        int i1=0,j1=1;
        int max=Integer.MIN_VALUE;
        int start=0,end=0;
        for(int i=0;i<len;i++)
        {
            if(i1<len && j1<len && s.charAt(i1)==s.charAt(j1))
            {   
                arr[i1][j1]=1;
                if(j1-i1+1>max)
                {
                    max=j1-i1+1;
                    start=i1;
                    end=j1;
                }
                    
            }
            i1++;
            j1++;
        }
        
        for(int p=2;p<len;p++)
        {
            int temp=p;
            for(int k=0;k<len;k++)
            {
                
                if(temp<len && s.charAt(k)==s.charAt(temp) && arr[k+1][temp-1]==1)
                {
                    arr[k][temp]=1;
                    if(temp-k+1>max)
                    {
                    max=temp-k+1;
                    start=k;
                    end=temp;
                    }
                }
                temp++;
            }
        }
        return s.substring(start,end+1);
    }
}
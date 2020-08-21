class Solution {
    public String sort(String val)
    {
            char arr[]=val.toCharArray();
            Arrays.sort(arr);
           return new String(arr);
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        String val1,val2;
        HashMap<String,ArrayList<String>> a =new HashMap<>();
        for (int i=0;i<strs.length;i++)
        {
            val1=strs[i];
            val2=sort(val1);
            if(a.containsKey(val2))
            {
                a.get(val2).add(val1);
            }
            else
            {
                ArrayList<String> b =new ArrayList<String>();
                b.add(val1);
                a.put(val2,b);
            }
            
        }
        List<List<String>> q =new ArrayList<>();
        for( String name:a.keySet())
        {  List<String> W ;
            W=a.get(name);
            q.add(W);
        }
        
        return q;
    }
}
public class Q2Longest_Common_Prefix {
    public static String longestCommonPrefix(String []strs)
    {
        if(strs==null || strs.length==0)
        {
            return "";
        }
        String s1=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(s1)!=0)
            {
                s1=s1.substring(0,s1.length()-1);
                if(s1.isEmpty())
                {
                    return "";
                }
            }
        }
        return s1;
    }
    public static void main(String[] args) {
         String []strs={"flower","flow","flight"};
         System.out.println(longestCommonPrefix(strs));
    }
}

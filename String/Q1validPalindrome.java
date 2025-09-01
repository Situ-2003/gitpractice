public class Q1validPalindrome
{
    public  static boolean isPalindrome(String s)
    {
        int left=0,right=s.length()-1;
        String s1=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        while(left<right)
        {
            if(s1.charAt(left)!=s1.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
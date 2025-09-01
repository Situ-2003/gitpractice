import java.util.Stack;

public class reversestack {
    public static String revrse(String s)
    {
        Stack<Character> s1=new Stack<>();

        for(char c:s.toCharArray())
        {
            s1.push(c);
        }
        StringBuilder Sb=new StringBuilder();
        while(!s1.isEmpty())
        {
            Sb.append(s1.pop());
        }
        return Sb.toString();
    }
    public static void main(String[] args) {
        String s="Ankit";
        System.out.println(s);
        System.out.println(revrse(s));
    }
    
}

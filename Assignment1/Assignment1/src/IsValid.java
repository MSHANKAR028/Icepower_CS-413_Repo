import java.util.*;
// Time complexity o(n)
//Space complexity is o(n)
public class IsValid {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isOpen(ch)){
                stack.push(ch);
            }
            if(isClose(ch)){
                if(stack.isEmpty()){
                    return false;
                }
                char ch1=stack.pop();
                if(!isMatch(ch1,ch)){
                    return false;
                }

            }
        }
        if (!stack.isEmpty())
            return false;

        return true;
    }


    public static boolean isOpen(char ch){
        return ch=='('||ch=='{'||ch=='[';

    }
    public static boolean isClose(char ch){
        return ch==')'||ch=='}'||ch==']';
    }

    public static boolean isMatch(char ch, char ch1){
        return ((ch=='('&& ch1==')')||(ch=='{'&& ch1=='}')||(ch=='['&& ch1==']'));
    }

    public static void main(String[] args) {
        String s="[][](){}";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paranthesis");
        String str=sc.nextLine();
        boolean valid=isValid(s);
        boolean valid1=isValid(str);
        System.out.println(valid);
        System.out.println(valid1);
    }





}

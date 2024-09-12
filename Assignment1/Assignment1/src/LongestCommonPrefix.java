import java.util.*;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs==null || strs.length==0){
            return prefix;
        }
        String first = strs[0];

        for(int i=0; i<first.length(); i++) {
            char ch = first.charAt(i);
            boolean match = true;
            for(int j=1; j<strs.length; j++) {
                String temp = strs[j];
                if(i >= temp.length() || ch != temp.charAt(i)) {
                    match = false;
                    break;
                }
            }
            if(match) {
                prefix = prefix + ch;
            }
            else
                break;

        }
        return prefix;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] strs = sc.nextLine().split(" ");
        System.out.println(longestCommonPrefix(strs));


    }











}


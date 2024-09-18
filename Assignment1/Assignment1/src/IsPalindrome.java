import java.util.Scanner;
// Time Complexity: O(n)
// Space Complexity: 

public class IsPalindrome {

   public static boolean isPalindrome(String  s) {
        boolean palindrome = true;
        for(int left=0, right=s.length()-1; left<right; left++, right--) {
            if(s.charAt(left) != s.charAt(right)) {
                palindrome = false;
            }
        }

        return palindrome;
    }

    public static boolean  isPalindromePhrase(String str) {
     String s="";
     for(int i=0; i<str.length(); i++) {
         char ch = str.charAt(i);
         if(Character.isLetterOrDigit(ch)) {
             s+=Character.toLowerCase(ch);
         }
     }
         System.out.println(s);
        return isPalindrome(s);
    }





public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String s = sc.nextLine();
    System.out.println(isPalindromePhrase(s));
}











}

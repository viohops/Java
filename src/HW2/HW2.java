package HW2;

public class HW2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abwba"));
        System.out.println(isPalindrome("abbaaaa"));
    }

    static boolean isPalindrome(String word){
        StringBuilder rev = new StringBuilder();
        boolean flag = false;
        for (int i = word.length()-1; i>=0; i--){
            rev.append(word.charAt(i));
        }
        if(rev.toString().equals(word)){
            flag = true;
        }
        return flag;
    }

}

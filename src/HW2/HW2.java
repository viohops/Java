package HW2;

public class HW2 {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("abba"));
//        System.out.println(isPalindrome("abwba"));
//        System.out.println(isPalindrome("abbaaaa"));

        long start = System.currentTimeMillis();
        System.out.println(isPalindrome("abwba"));
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);

        long start1 = System.currentTimeMillis();
        System.out.println(isPalindrome2("abwba"));
        long finish1 = System.currentTimeMillis();
        long elapsed1 = finish1 - start1;
        System.out.println("Прошло времени, мс: " + elapsed1);
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

    static boolean isPalindrome2(String word){
        String rev = "";
        boolean flag = false;
        for (int i = word.length()-1; i>=0; i--){
            rev += word.charAt(i);
        }
        if(rev.equals(word)){
            flag = true;
        }
        return flag;
    }

}

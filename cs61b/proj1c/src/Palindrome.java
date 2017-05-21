/**
 * Created by ty on 2017/4/28.
 */
public class Palindrome {
    public static Deque<Character> wordToDeque(String word) {
        int len = word.length();
        Deque<Character> res = new LinkedListDequeSolution<Character>();
        for (int i = 0; i < len; i++) {
            res.addLast(word.charAt(i));
        }
        return res;
    }

    public static boolean isPalindrome(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        Deque<Character> d1 = Palindrome.wordToDeque(word);
        return isPalindromeRecur(d1);
    }

    private static boolean isPalindromeRecur(Deque<Character> d1) {
        if (d1.size() == 1 || d1.size() == 0) {
            return true;
        }
        if ((d1.removeLast()).equals(d1.removeFirst())) {
            return isPalindromeRecur(d1);
        }
        return false;
    }
}

/** This class outputs all palindromes in the words file in the current directory. */
public class PalindromeFinder {
    public static OffByN o = new OffByN(1);

    public static void main(String[] args) {

        int minLength = 4;
        In in = new In("words");

        while (!in.isEmpty()) {
            String word = in.readString();
            Deque<Character> d = Palindrome.wordToDeque(word);
            if (word.length() >= minLength && offbyn(d)) {
                System.out.println(word);
            }
        }
    }
    private static boolean offbyn( Deque<Character> d){
        if(d.size() == 0 || d.size() == 1){
            return true;
        }
        if(o.equalChars(d.removeFirst(), d.removeLast())){
            return offbyn(d);
        }
        return false;
    }
} 

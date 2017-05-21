/**
 * Created by ty on 2017/4/28.
 */
public class OffByN implements CharacterComparator {
    private int N;

    public OffByN(int N) {
        this.N = N;
    }

    @Override
    public boolean equalChars(char x, char y) {
        int dif = y - x;
        if (dif == N) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        OffByN o = new OffByN(5);
        System.out.println(o.equalChars('a', 'f'));
    }
}

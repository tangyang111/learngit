/**
 * Created by ty on 2017/4/28.
 */
public class OffByOne implements CharacterComparator {
    @Override
    public boolean equalChars(char x, char y) {
        Character xx = x;
        Character yy = y;
        if (xx.equals(yy)) {
            return true;
        }
        return false;
    }
}

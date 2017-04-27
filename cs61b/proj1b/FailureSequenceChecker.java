public class FailureSequenceChecker {
   public static void main(String[] args) {
      StudentArrayDeque<Integer> ssld = new StudentArrayDeque<Integer>();
      ssld.isEmpty();
      ssld.addFirst(1);
      ssld.removeLast();
      ssld.removeFirst();
      ssld.size();
    }
}

/** If your computer is set up properly, this file should
  * compile when moved into the same directory as 
  * StudentArrayDeque.class, or if you're using
  * IntelliJ, after you have imported proj1b.jar */

/**
 * F U C K ！！！
 * jar包中default package中的class文件只能被工程中default package中的java文件(src目录中直接的java文件)import！！！
 *
 */

public class StudentArrayDequeLauncher {
    public static void main(String[] args) {
        StudentArrayDeque<Integer> sad1 = new StudentArrayDeque<Integer>();
        sad1.addLast(5);
        sad1.addLast(10);
        sad1.printDeque();
    }
} 

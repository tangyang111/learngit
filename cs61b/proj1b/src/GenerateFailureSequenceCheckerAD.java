import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.fail;

public class GenerateFailureSequenceCheckerAD {

    private static final String OP_STRING = "====================================(.+?)(expected(.*?)\n)(.*)=====> FAILED!";
    private static final Pattern OP_PATTERN = Pattern.compile(OP_STRING, Pattern.DOTALL);
    private static final String failureSequenceFile = "FailureSequenceChecker.java";

    public static void main(String[] args) {
        PrintStream oldStream = System.out;

        /* From http://stackoverflow.com/questions/8708342/redirect-console-output-to-string-in-java */
       
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream captured = new PrintStream(baos);
        System.setOut(captured);
        System.out.flush();
        
        jh61b.junit.TestRunner.runTests(TestArrayDeque1B.class);
        String referenceOutput = baos.toString();
        System.setOut(oldStream);


        Matcher m = OP_PATTERN.matcher(referenceOutput);
        if (!m.find()) {
            fail("Error, you do not seem to have any failures that include a failure sequence generated by an assertEquals statement:\n{{{{{" + referenceOutput + "}}}}}");
        }


        String failureSequenceText = m.group(1);
        String expectationText = m.group(2);

        failureSequenceText = failureSequenceText.trim();

        System.out.println("Your failure sequence was:");
        System.out.println("========================");
        System.out.println(failureSequenceText);
        System.out.println("========================");


        System.out.println("Writing your failure sequence to FailureSequenceChecker.java so you can manually check it.");
        System.out.println("According to your failed test, your code expects that the final step of this sequence should fail in the following way: " + expectationText);

        Out out = new Out(failureSequenceFile);
        out.println("public class FailureSequenceChecker {");
        out.println("   public static void main(String[] args) {");
        out.println("      StudentArrayDeque<Integer> ssld = new StudentArrayDeque<Integer>();");
        for (String line : failureSequenceText.split("[\\r\\n]+")) {
            out.println("      ssld." + line +  ";");
        }
        out.println("    }");
        out.println("}");
        out.close();

    }
} 
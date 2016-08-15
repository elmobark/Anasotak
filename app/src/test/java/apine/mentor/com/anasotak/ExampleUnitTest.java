package apine.mentor.com.anasotak;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void tab() throws Exception{
        String a[]=new String[26];
        for (int i=0;i>26;i++){
            Scanner c=new Scanner(System.in);
            a[i]="*"+c.next()+"*,";
        }for (int i=0;i>26;i++) {
            System.out.print(a[i]);
        }
    }
}
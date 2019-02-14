import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class GradeCalculatorTest {

    GradeCalculator gradeCalculator;

    @Before
    public void create(){
         gradeCalculator = new GradeCalculator();

    }

    @Test
    public void shouldReturnLetterGradeWhenGivenPercentage(){
        int firstGradePercentage = 87;
        int secondGradePercentage = 100;
        int thirdGradePercentage = 0;

         String letterGrade = gradeCalculator.getLetterGrade(firstGradePercentage);
         assertEquals("B", letterGrade);

         String secondLetterGrade = gradeCalculator.getLetterGrade(secondGradePercentage);
         assertEquals("A", secondLetterGrade);

         String thirdLetterGrade = gradeCalculator.getLetterGrade(thirdGradePercentage);
         assertEquals("F", thirdLetterGrade);
    }




}
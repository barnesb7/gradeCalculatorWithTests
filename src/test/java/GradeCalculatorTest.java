import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void shouldReturnAveragePercentWhenGivenCollectionOfPercentageGrades(){
        int expectedAveragePercentage = 10;
        int expectedZeroForAllGrades = 0;

        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(10);
        grades.add(15);
        grades.add(5);

         int actualAveragePercentage = gradeCalculator.getAveragePercentageOfGrades(grades);

         assertEquals(expectedAveragePercentage, actualAveragePercentage);


         ArrayList<Integer> zeroGrades = new ArrayList<>();
         grades.add(0);
         grades.add(0);
         grades.add(0);

         int actualZeroForAllGrades = gradeCalculator.getAveragePercentageOfGrades(zeroGrades);

         assertEquals(expectedZeroForAllGrades, actualZeroForAllGrades);

    }




}
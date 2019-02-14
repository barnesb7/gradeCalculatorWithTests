import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class GradeCalculatorTest {

    GradeCalculator gradeCalculator;

    @Before
    public void create() {
        gradeCalculator = new GradeCalculator();
    }

    @Test
    public void shouldReturnLetterGradeWhenGivenPercentage() {
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
    public void shouldReturnAveragePercentWhenGivenCollectionOfPercentageGrades() {
        int expectedAveragePercentage = 10;

        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(10);
        grades.add(15);
        grades.add(5);

        int actualAveragePercentage = gradeCalculator.getAveragePercentageOfGrades(grades);

        assertEquals(expectedAveragePercentage, actualAveragePercentage);
    }

    @Test
    public void shouldReturnZeroIfAllGradesAreZero() {

        int expectedZeroForAllGrades = 0;

        ArrayList<Integer> zeroGrades = new ArrayList<>();
        zeroGrades.add(0);
        zeroGrades.add(0);
        zeroGrades.add(0);

        int actualZeroForAllGrades = gradeCalculator.getAveragePercentageOfGrades(zeroGrades);

        assertEquals(expectedZeroForAllGrades, actualZeroForAllGrades);
    }

    @Test
    public void shouldReturnGPAEquivalentForSingleLetterGrade() {
        double expectedGPA = 4.0;
        double actualGPA = gradeCalculator.getGPAForLetterGrade("A");

        assertEquals(expectedGPA, actualGPA, 0.01);
    }

    @Test
    public void shouldReturnZeroIfLetterGradeEqualsZero() {
        double expectedZeroGPA = 0.00;
        double actualZeroGPA = gradeCalculator.getGPAForLetterGrade("G");

        assertEquals(expectedZeroGPA, actualZeroGPA, 0.001);
    }

    @Test
    public void shouldReturnAverageGPA_ForMultipleLetterGrades() {
        double expectedAverageGPA = 3.00;
        ArrayList<String> letterGrades = new ArrayList<>(Arrays.asList("B", "A+", "C-"));

        double actualAverageGPA = gradeCalculator.getAverageGradePointAverageForLetterGrades(letterGrades);


        double expectedSecondAverageGPA = 2.60;
        ArrayList<String> secondLetterGrades = new ArrayList<>(Arrays.asList("B", "A+", "C-", "D+", "B-"));

        double secondActualAverageGPA = gradeCalculator.getAverageGradePointAverageForLetterGrades(secondLetterGrades);

        assertEquals(expectedAverageGPA, actualAverageGPA, 0.001);
        assertEquals(expectedSecondAverageGPA, secondActualAverageGPA, 0.001);
    }

    @Test
    public void shouldReturnAnAverageOfZeroIfAllLetterGradesSumToZero() {

        double expectedZeroAverageGPA = 0.00;
        ArrayList<String> zeroLetterGrades = new ArrayList<>(Arrays.asList("G", "F", "Z", "F+"));

        double actualZeroAverageGPA = gradeCalculator.getAverageGradePointAverageForLetterGrades(zeroLetterGrades);

        assertEquals(expectedZeroAverageGPA, actualZeroAverageGPA, 0.001);
    }

}
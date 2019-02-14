import java.text.DecimalFormat;
import java.util.ArrayList;

public class GradeCalculator {

    DecimalFormat decimalFormat = new DecimalFormat("###.00");

    public String getLetterGrade(int percentage) {

        return checkPercentageForGrade(percentage);

    }

    public int getAveragePercentageOfGrades(ArrayList<Integer> grades) {

        int gradeSum = 0;

        for (Integer grade : grades) {
            gradeSum += grade;
        }

        try {
            return gradeSum / grades.size();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    public double getGPAForLetterGrade(String letterGrade) {
        return getGPAEquivalentOfLetter(letterGrade);
    }

    public double getAverageGradePointAverageForLetterGrades(ArrayList<String> letterGrades) {

        double gradeSum = 0.00;

        for (String grade : letterGrades) {
            gradeSum += getGPAForLetterGrade(grade);
        }

        try {
            return gradeSum / letterGrades.size();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            return 0.00;
        }

    }

    private String checkPercentageForGrade(int percentage) {
        if (percentage <= 100 && percentage > 89) {
            return "A";
        } else if (percentage <= 89 && percentage > 79) {
            return "B";
        } else if (percentage <= 79 && percentage > 69) {
            return "C";
        } else if (percentage <= 69 && percentage > 59) {
            return "D";
        } else {
            return "F";
        }
    }

    private double getGPAEquivalentOfLetter(String letterGrade) {
        if (letterGrade.equals("A-") || letterGrade.equals("A") || letterGrade.equals("A+")) {
            return 4.00;
        } else if (letterGrade.equals("B-") || letterGrade.equals("B") || letterGrade.equals("B+")) {
            return 3.00;
        } else if (letterGrade.equals("C-") || letterGrade.equals("C") || letterGrade.equals("C+")) {
            return 2.00;
        } else if (letterGrade.equals("D-") || letterGrade.equals("D") || letterGrade.equals("D+")) {
            return 1.00;
        } else {
            return 0.00;
        }
    }

}

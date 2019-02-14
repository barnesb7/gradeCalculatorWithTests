public class GradeCalculator {


    public String getLetterGrade(int percentage){

      return checkPercentageForGrade(percentage);

    }


    private String checkPercentageForGrade(int percentage){
        if(percentage <= 100  && percentage > 89){
            return "A";
        } else if (percentage <= 89 && percentage > 79){
            return "B";
        } else if (percentage <= 79 && percentage > 69){
            return "C";
        } else if (percentage <= 69 && percentage > 59){
            return "D";
        } else {
            return "F";
        }
    }

}

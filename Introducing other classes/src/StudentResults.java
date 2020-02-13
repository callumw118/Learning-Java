public class StudentResults {

    //Field variables - Can only be accessed in this class
    private String fullName;
    private String examName;
    private String examScore;
    private String examGrade;

    //Constructor to assign initial value to private field variables
    //Java calls constructor first automatically when new object is created
    StudentResults() {
        fullName = "No name given";
        examName = "Unknown";
        examScore = "No Score";
        examGrade = "Unknown";
    }

    //Method which returns the name and assigns it to fullName, overwriting its current value
    String fullName(String name) {

        fullName = name;
        return fullName;
    }

   /* boolean validName(String fullName){

        if(fullName.matches("[a-zA-z]")){
            return true;
        }
        return false;
    } */

    //Method which checks the exam code
    String examName(String examCode) {

        switch (examCode) {
            case "VB":
                examName = "Visual Basic";
                break;
            case "JV":
                examName = "Java";
                break;
            case "C#":
                examName = "C# .NET";
                break;
            default:
                examName = "No Exam Selected";
                break;

        }
        return examName;

    }

    // Method which checks if entered exam code is valid
    boolean validExam(String examCode){

        // valid inputs are "VB", "JV", "C#"
        if(examCode.equals("VB") || examCode.equals("JV") || examCode.equals("C#")){
            return true;
        }

        // invalid inputs is everything else

        return false;
    }

    String examScore(int score) {

        examScore = score + " out of 50";
        return examScore;

    }

    boolean validScore(int score){

        if(score >= 0 && score <= 50){
            return true;
        }
        return false;
    }

    //Method which assigns the grade to the score
    private String getGrade(int score) {

        String examGrade = "";

        if (score >= 0 && score <= 10) {
            examGrade = "Fail";
        } else if (score >= 11 && score <= 20) {
            examGrade = "D";
        } else if (score >= 21 && score <= 30) {
            examGrade = "C";
        } else if (score >= 31 && score <= 40) {
            examGrade = "B";
        } else if (score >= 41) {
            examGrade = "A";
        }

        return examGrade;
    }

    String examGrade(int score) {

        examGrade = this.getGrade(score);
        return examGrade;
    }
}

//Sub Class of StudentResults
//By using extends it inherits the code from the StudentResults Class
public class Certificates extends StudentResults {

    private String certificate;

    //Since only one constructor can be called, super() is used to call
    //the constructor from the super class StudentResults
    Certificates() {
        super();
        certificate = "No Certificate Awarded";
    }

    String certificateAwarded(int score) {

        String grade = examGrade(score);

        switch (grade) {
            case "A":
                this.certificate = "Certificate of Excellence";
                break;
            case "B":
            case "C":
                this.certificate = "Certificate of Achievement";
                break;
            default:
                return this.certificate;
        }
        return this.certificate;
    }

}

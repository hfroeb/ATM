/**
 * Created by halleyfroeb on 8/31/16.
 */ // attempt at creating a GPA
public class Student {
    String letterGrade;
    int grade;
    int averageGrade;
    int numberOfGrades;

    public void chooseGrade(){
    do {
        System.out.println("Enter one letter grade at a time");
        letterGrade = Main.scanner.nextLine();
        if(letterGrade.equalsIgnoreCase("a")) {
            grade = 4;
        }
        else if (letterGrade.equalsIgnoreCase("b")){
            grade = 3;
        }
        else if (letterGrade.equalsIgnoreCase("c")){
            grade = 2;
        }
        else if (letterGrade.equalsIgnoreCase("d")){
            grade = 1;
        }
        else if (letterGrade.equalsIgnoreCase("f")){
            grade = 0;
        }
        for(int i = 0;i< grade.length;i++) {
            int[i] = "Number" + i;}
    while (letterGrade.equalsIgnoreCase
        averageGrade = (averageGrade + grade)/ numberOfGrades;
        numberOfGrades =
        grade = i + gr
        if ()
    }
}


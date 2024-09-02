import java.util.Scanner;
public class Grade {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String grade = new String();

        //ask user for the type of assignment
        System.out.println("What is the type of the assessment? Type 1 for midterm, type 2 for project, and type 3 for final.");
        int type = scnr.nextInt();

        //ask user for their score
        System.out.println("Enter the score:");
        int score = scnr.nextInt();

        
        if(type == 1) {// midterm
            grade = findGrade(score, 90,90,65,65);
        }
        else if(type == 2) {//project
            grade = findGrade(score, 85, 85, 50, 50);
        }
        else if(type == 3){//final exam
            grade = findGrade(score, 80, 80, 60, 60);
        }
        else{
            System.out.println("Invalid Input.");
        }
        
        //Print out the grade for the submitted assessment
        System.out.printf("Grade for Assessment is %s", grade);

        scnr.close();

    }

    //method will take in the ranges and generate the grade based on it.
    public static String findGrade(int score, int lowerLevelExcellent, int upperLevelGood, int lowerLevelGood, int upperLevelPoor){

        String grade = new String();
        //figure out the grade
        if(score >= lowerLevelExcellent){
            grade = "Excellent";
        }
        else if(score < upperLevelGood && score >= lowerLevelGood){
            grade = "Good";
        }
        else if(score < upperLevelPoor){
            grade = "Poor";
        }
        else{
            grade = "Invalid Score";
        }
        
        return grade;
    }
}
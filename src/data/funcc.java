package data;
import java.util.*;
import data.models.*;

public class funcc {

    // Method to validate the grade input within the range of 60 to 95.
    public static int DataValidator(Scanner scanner) {
        int dataC = -1;

        try {

           

            dataC = scanner.nextInt();

            if (dataC >= 60 && dataC <= 95) {
                return dataC;
            } else {
            	 System.out.print("Please Enter a grade not bellow 60 and not above 95");
            
                return DataValidator(scanner);
            }
        } catch (InputMismatchException e) {
            scanner.next();
           	System.out.print("Invalid data type");
            return DataValidator(scanner);
        }
    }
 

    ////// User data collection *Coded by ISOY*
    public static void CollectData(Scanner scanner) {
        // Instantiate subject models.
        comIntro newIntro = new comIntro();
        modernMath newMath = new modernMath();
        nstp1 newSNstp1 = new nstp1();
        PE newPe = new PE();
        precal newPrecal = new precal();
        prog1 newProg1 = new prog1();
        RnPh newRnPh = new RnPh();
        soc newSoc = new soc();
        userdata newUserdata = new userdata();
        Uts newUts = new Uts();

        // Collect basic user information.
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                           Grading System                          |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                       Please Fill All Fields                      |");
        System.out.println("---------------------------------------------------------------------");
//metog
        System.out.print("| Name: ");
        newUserdata.name = scanner.next();
        
        System.out.print("| Year Level: ");
        newUserdata.YearLevel = scanner.nextInt();
        
        System.out.print("| Age: ");
        newUserdata.age = scanner.nextInt();
        
        System.out.print("| Course: ");
        newUserdata.course = scanner.next();
        
        System.out.print("| Section: ");
        newUserdata.section = scanner.nextInt();

        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                        Collecting Grades                          |");
        System.out.println("---------------------------------------------------------------------");

        System.out.println("| Intro to Computing Grades:");
        newIntro.prelim = collectGrade(scanner, "Prelim");
        newIntro.midterm = collectGrade(scanner, "Midterm");
        newIntro.prefinal = collectGrade(scanner, "Pre-final");
        newIntro.finals = collectGrade(scanner, "Finals");
        newIntro.ave = calculateAverage(newIntro.prelim, newIntro.midterm, newIntro.prefinal, newIntro.finals);

        System.out.println("| Modern Mathematics Grades:");
        newMath.prelim = collectGrade(scanner, "Prelim");
        newMath.midterm = collectGrade(scanner, "Midterm");
        newMath.prefinal = collectGrade(scanner, "Pre-final");
        newMath.finals = collectGrade(scanner, "Finals");
        newMath.ave = calculateAverage(newMath.prelim, newMath.midterm, newMath.prefinal, newMath.finals);

        System.out.println("| NSTP 1 Grades:");
        newSNstp1.prelim = collectGrade(scanner, "Prelim");
        newSNstp1.midterm = collectGrade(scanner, "Midterm");
        newSNstp1.prefinal = collectGrade(scanner, "Pre-final");
        newSNstp1.finals = collectGrade(scanner, "Finals");
        newSNstp1.ave = calculateAverage(newSNstp1.prelim, newSNstp1.midterm, newSNstp1.prefinal, newSNstp1.finals);
   
        System.out.println("| PE Grades:");
        newPe.prelim = collectGrade(scanner, "Prelim");
        newPe.midterm = collectGrade(scanner, "Midterm");
        newPe.prefinal = collectGrade(scanner, "Pre-final");
        newPe.finals = collectGrade(scanner, "Finals");
        newPe.ave = calculateAverage(newPe.prelim, newPe.midterm, newPe.prefinal, newPe.finals);

        System.out.println("| Pre-Calculus Grades:");
        newPrecal.prelim = collectGrade(scanner, "Prelim");
        newPrecal.midterm = collectGrade(scanner, "Midterm");
        newPrecal.prefinal = collectGrade(scanner, "Pre-final");
        newPrecal.finals = collectGrade(scanner, "Finals");
        newPrecal.ave = calculateAverage(newPrecal.prelim, newPrecal.midterm, newPrecal.prefinal, newPrecal.finals);

        System.out.println("| Programming 1 Grades:");
        newProg1.prelim = collectGrade(scanner, "Prelim");
        newProg1.midterm = collectGrade(scanner, "Midterm");
        newProg1.prefinal = collectGrade(scanner, "Pre-final");
        newProg1.finals = collectGrade(scanner, "Finals");
        newProg1.ave = calculateAverage(newProg1.prelim, newProg1.midterm, newProg1.prefinal, newProg1.finals);

        System.out.println("| Reading in Philippine History Grades:");
        newRnPh.prelim = collectGrade(scanner, "Prelim");
        newRnPh.midterm = collectGrade(scanner, "Midterm");
        newRnPh.prefinal = collectGrade(scanner, "Pre-final");
        newRnPh.finals = collectGrade(scanner, "Finals");
        newRnPh.ave = calculateAverage(newRnPh.prelim, newRnPh.midterm, newRnPh.prefinal, newRnPh.finals);

        System.out.println("| Sociology Grades:");
        newSoc.prelim = collectGrade(scanner, "Prelim");
        newSoc.midterm = collectGrade(scanner, "Midterm");
        newSoc.prefinal = collectGrade(scanner, "Pre-final");
        newSoc.finals = collectGrade(scanner, "Finals");
        newSoc.ave = calculateAverage(newSoc.prelim, newSoc.midterm, newSoc.prefinal, newSoc.finals);

        System.out.println("| Understanding the Self (UTS) Grades:");
        newUts.prelim = collectGrade(scanner, "Prelim");
        newUts.midterm = collectGrade(scanner, "Midterm");
        newUts.prefinal = collectGrade(scanner, "Pre-final");
        newUts.finals = collectGrade(scanner, "Finals");
        newUts.ave = calculateAverage(newUts.prelim, newUts.midterm, newUts.prefinal, newUts.finals);

        displayStudentInfo(newUserdata, newIntro, newMath, newSNstp1, newPe, newPrecal, newProg1, newRnPh, newSoc, newUts);
    }

    private static int collectGrade(Scanner scanner, String gradeType) {
      System.out.print("| " + gradeType + " Grade: ");
        return DataValidator(scanner);
    }

    // Helper method to calculate the average of four grades.
    private static int calculateAverage(int prelim, int midterm, int prefinal, int finals) {
        return (prelim + midterm + prefinal + finals) / 4;
    }

    // Method to display the student information and their grades.
    private static void displayStudentInfo(userdata newUserdata, comIntro newIntro, modernMath newMath, nstp1 newSNstp1, PE newPe, precal newPrecal, prog1 newProg1, RnPh newRnPh, soc newSoc, Uts newUts) {
        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("|                     Student Information Summary                   |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("| Name: " + newUserdata.name);
        System.out.println("| Year Level: " + newUserdata.YearLevel);
        System.out.println("| Age: " + newUserdata.age);
        System.out.println("| Course: " + newUserdata.course);
        System.out.println("| Section: " + newUserdata.section);
        System.out.println("---------------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                            Grades Summary                         |");
        System.out.println("---------------------------------------------------------------------");

        System.out.println("| Intro to Computing: ");
        System.out.println("| Prelim: " + newIntro.prelim + ", Midterm: " + newIntro.midterm + ", Pre-final: " + newIntro.prefinal + ", Finals: " + newIntro.finals + ", Average: " + newIntro.ave);

        System.out.println("| Modern Mathematics: ");
        System.out.println("| Prelim: " + newMath.prelim + ", Midterm: " + newMath.midterm + ", Pre-final: " + newMath.prefinal + ", Finals: " + newMath.finals + ", Average: " + newMath.ave);

        System.out.println("| NSTP 1: ");
        System.out.println("| Prelim: " + newSNstp1.prelim + ", Midterm: " + newSNstp1.midterm + ", Pre-final: " + newSNstp1.prefinal + ", Finals: " + newSNstp1.finals + ", Average: " + newSNstp1.ave);

        System.out.println("| PE: ");
        System.out.println("| Prelim: " + newPe.prelim + ", Midterm: " + newPe.midterm + ", Pre-final: " + newPe.prefinal + ", Finals: " + newPe.finals + ", Average: " + newPe.ave);

        System.out.println("| Pre-Calculus: ");
        System.out.println("| Prelim: " + newPrecal.prelim + ", Midterm: " + newPrecal.midterm + ", Pre-final: " + newPrecal.prefinal + ", Finals: " + newPrecal.finals + ", Average: " + newPrecal.ave);

        System.out.println("| Programming 1: ");
        System.out.println("| Prelim: " + newProg1.prelim + ", Midterm: " + newProg1.midterm + ", Pre-final: " + newProg1.prefinal + ", Finals: " + newProg1.finals + ", Average: " + newProg1.ave);

        System.out.println("| Reading in Philippine History: ");
        System.out.println("| Prelim: " + newRnPh.prelim + ", Midterm: " + newRnPh.midterm + ", Pre-final: " + newRnPh.prefinal + ", Finals: " + newRnPh.finals + ", Average: " + newRnPh.ave);

        System.out.println("| Sociology: ");
        System.out.println("| Prelim: " + newSoc.prelim + ", Midterm: " + newSoc.midterm + ", Pre-final: " + newSoc.prefinal + ", Finals: " + newSoc.finals + ", Average: " + newSoc.ave);

        System.out.println("| Understanding the Self (UTS): ");
        System.out.println("| Prelim: " + newUts.prelim + ", Midterm: " + newUts.midterm + ", Pre-final: " + newUts.prefinal + ", Finals: " + newUts.finals + ", Average: " + newUts.ave);
    }
}

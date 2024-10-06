/**
 * @(#)Grading_System.java
 *
 * Grading_System application
 *
 * @author 
 * @version 1.00 2024/10/1
 */
 import data.*;
 //import data.models.*;
 import java.util.*;
public  class Grading_System {
    
    public static void main(String[] args) {
    Scanner nS = new Scanner(System.in);
      //  funcc newf = new funcc();
   
      //  comIntro newCom = new comIntro();
    //	System.out.println("");
       // newCom.prelim= newf.GradeValidator(nS);
     boolean j = true;
     int c;
     while(j){
     	
     	
     	System.out.println("Do you want to this APP? \n[1].Yes\n[2]NO");
     	c= nS.nextInt();
     		switch(c){
     			
     			case 1:
     				funcc newF = new funcc();
     newF.CollectData(nS);
     				break;
     			case 2:
     				
     				j =false;
     				break;
     			
     			
     		}
     }


    }
}

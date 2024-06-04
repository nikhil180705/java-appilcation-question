package FIAT;
import java.util.*;
class GPAcalculation{
    static int sample(){
        Scanner sc=new Scanner(System.in);
        int marks;
      int[] arr=new int[6];
      int grade;
      int gpa=0;
     for(int a=0;a<6;a++){
        System.out.println("ENTER THE MARKS OF SUBJECT "+(a+1));
      marks=sc.nextInt();
      if(marks<=100 && marks>=91){
         grade=10;
      }
      else if(marks>=81 && 90>=marks){
        grade=9;
      }
      else if(marks>=71 && 80>=marks){
        grade=8;
      }
      else if(marks>=61 && 70>=marks){
        grade=7;
      }
      else if(marks>=57 && 60>=marks){
        grade=6;
      }
      else if(marks>=50 && 56>=marks){
        grade=5;
      }
      else{
        grade=0;
      }
      arr[a]=grade;
     }
     for(int i=0;i<6;i++){
        gpa += arr[i];
     }
    
     return (gpa/6);
    }
   public static void main(String[] args){
    student s=new student();
    Scanner sc=new Scanner(System.in);
    int tstudents=sc.nextInt();
    String[][] a=new String[tstudents][3];
        for(int i=0;i<tstudents;i++){
        for(int j=0;j<3;j++){
          if(j==0){
            System.out.println("ENTER NAME OF STUDENT "+(i+1));
            a[i][j]=sc.next();
          }
         else if(j==1){
            System.out.println("ENTER COURSE OF STUDENT "+(i+1));
            a[i][j]=sc.next();
         }
         else if(j==2){
            
            a[i][j]=String.valueOf(sample());
         }
        }

    }
    for(int i=0;i<tstudents;i++){
        System.out.println("DETAIL OF STUDENT"+(i+1));
        for(int j=0;j<3;j++){
           if(j==0){
            System.out.println("NAME: "+a[i][j]);
           }
        else if(j==1){
            System.out.println("COURSE: "+a[i][j]);
           }
           else if (j==2){
            System.out.println("GPA: "+a[i][j]);
           }
        }
    }
   }

}
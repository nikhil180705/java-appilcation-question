package MODEL;
import java.util.*;
public class QUIZCOMPITATION {
    public static void main(String[] agrgs)throws Exception{
        Scanner sc=new Scanner(System.in);
        String [] qus={"1.WHAT IS THE EXCEPTION FOR ARRAY?",
                       "2.WHATIS THE LOCALHOST VALUE OF SQL?",
                        "WHAT IS THE METHOD FOR CALLING WAIT? "};

        String[] ans={"ARRAYINDEXOUTOFBOUNDARY","3306","NOTIFY"};
        int score=0;
        for(int i=0;i<qus.length;i++){
            System.out.println(qus[i]);
            String ans1=sc.next();
            if(ans1.equalsIgnoreCase(ans[i])){
                System.out.println("CORRECT!!!");
                score++;
                System.out.println("SCORE: "+score+"/3");
            }
            else{
                System.out.println("WRONG ANSWER");
            }
        }          
        double percentage=(score/3)*100;
        System.out.println("PRECENTAGE: "+percentage);
    } 
}

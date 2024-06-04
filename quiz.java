package SIAT;
import java.util.*;
import java.io.*;

public class quiz {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        int score=0;
        for(int i=0;i<3;i++){           
            InputStreamReader ir=new InputStreamReader(System.in) ;
            BufferedReader br=new BufferedReader(ir);
            String str=br.readLine();
            System.out.println("QUESTION "+i+": ");
            System.out.println(str);
            System.out.println("ENTER THE ANSWER: ");
            String ans=new String(sc.nextLine());
            String check=sc.nextLine();
            if(ans.equals(check)){
                System.out.println("CORRECT ANSWER");
                score +=1;
                System.out.println("SCORE: "+score+"/3");
            }
            else{
                System.out.println("WRONG ANSWER");
                System.out.println("ANSWER IS "+check);
            }
        }
        System.out.println("TOTAL: "+score);
        Double d=(double) (((double)score/3)*100);
        System.out.println("PERCENTAGE: "+d+"%");
    }
}

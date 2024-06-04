package FIAT;
import java.util.*;
public class EMPLOYEE {
    static int salary;
    static int allowance;
    static int deduction;
    static int calculation(){
       salary=(salary+allowance)-deduction;
       return salary;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[]  arr={"VIJAY","AJITH","SURYA","KARTHIK"};
        for(int i=0;i<arr.length;i++){
            System.out.println("NAME: "+arr[i]);     
            System.out.println("SALARY: "+(salary=sc.nextInt()));
            System.out.println("ALLOWANCE: "+(allowance=sc.nextInt()));
            System.out.println("DEDUCTION: "+(deduction=sc.nextInt()));
            System.out.println("PRESENT SALARY: "+calculation());
            System.out.println();
        } 

    }
}

package SIAT;
import java.util.*;
import java.io.*;
import java.util.regex.*;
public class PASSWORD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Console c=System.console();
        System.out.println("ENTER THE PASSWORD");
        char[] ch=c.readPassword();
        String str=String.valueOf(ch);
        System.out.println("THE PASSWORD: "+str);

       boolean d= Pattern.matches("[a-zA-Z0-9$%^&*@]{15}", str);
      if(d==true){
        System.out.println("YOU CREATE A STRONG PASSWORD");
      }
      else{
        System.out.println("PLEASE!! CREATE A STRONG PASSWORD");
     
    }
  
     
}}

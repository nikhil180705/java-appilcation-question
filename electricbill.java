import java.util.*;
interface EBBill{
    public double bill(double unit);
}
class domestic implements EBBill{

    @Override
    public double bill(double unit) {
        if(unit<=100){
            return (unit*1);
        }
        else if (unit>=101 && unit<=200){
            return (unit*2);
        }
        else if (unit>=201 && unit<=500){
            return (unit*2.50);
        }
        else{
            return(unit*6);
        }
    }
} 
class commercial implements EBBill{
    @Override
    public double bill(double unit) {
        if(unit<=100){
            return (unit*2);
        }
        else if (unit>=101 && unit<=200){
            return (unit*4.50);
        }
        else if (unit>=201 && unit<=500){
            return (unit*6);
        }
        else{
            return(unit*7);
        }
}
}
class MAIN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        domestic d=new domestic();
        commercial c=new commercial();
        String t1="Domestic";
        String t2="Commercial";
        int no=sc.nextInt();
        String name=sc.next();
        int pmonth=sc.nextInt();
        int cmonth=sc.nextInt();
        String type=sc.next();
        double UNIT;
        System.out.println("Consumer No: "+no);
        System.out.println("consummer Name: "+name);
        System.out.println("previous Month Bill: "+pmonth);
        System.out.println("current Month Bill: "+cmonth);
        if(type.equals(t1)){
            UNIT=cmonth-pmonth;
            System.out.println("Units consumed: "+UNIT);
            System.out.println("Electicity Current Type: "+type);
            System.out.println("Bill Amount: "+d.bill(UNIT));
        }
        else if(type.equals(t2)){
            UNIT=cmonth-pmonth;
            System.out.println("Units consumed: "+UNIT);
            System.out.println("Electicity Current Type: "+type);
            System.out.println("Bill Amount: "+c.bill(UNIT));
        }
    }
}

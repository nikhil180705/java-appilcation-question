package MODEL;
interface circle{
    public void circlearea(int radius);
}
interface triangle{
    public void trianglearea(int height,int breath);
}
interface rectangle{
    public void rectanglearea(int length,int breath);
}
class area implements circle,rectangle,triangle{
     
    @Override
    public void trianglearea(int height,int breath) {
       int area=(int) (0.5*height*breath);
       System.out.println("THE AREA OF TRIANGLLE: "+area);
    }

    @Override
    public void rectanglearea(int length,int breath) {
       int area=length*breath;
       System.out.println("THE AREA OF TRIANGLE: "+area);
    }

    @Override
    public void circlearea(int radius) {
        int area=(int) (Math.PI*radius*radius);
        System.out.println("THE AREA OF CIRCLE: "+area); 
    }  
}

public class SHAPES {
    public static void main(String[] agrs){
        area a=new area();
        a.trianglearea(5,10);
        a.rectanglearea(25, 45);
        a.circlearea(5);
    }
}

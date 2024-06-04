package MODEL;


public class thread {
    public static void main(String[] args) throws InterruptedException{
      Thread t=new Thread(){
        public void run(){
            int arr[]= {1,2,3,4,5,6,7,8,9,0};
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            System.out.println(sum);
        }
      };t.start();
      t.join();
      Thread a=new Thread(){
         public void run(){
            String arr3[]=new String[4];
            String arr1[]={"a","b","c","d","e","f"};
            String arr2[]={"b","a","d","e"};
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    
                    if(arr1[i]==(arr2[j])){
                        String arr4[]={arr2[j]};
                       }
                    }
                
            }
            for(int g=0;g<arr3.length;g++){
                System.out.print("\t"+arr3[g]);
            }
         }
      } ;
      a.start();
      

    }
}

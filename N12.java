package pkg1;
class MultiThreadingTwo implements Runnable{
    public void run(){
        try{
 
            System.out.println("Thread"+Thread.currentThread().getId()+"is runnng");
        }
    
        catch (Exception e){
            System.out.println("Exception is caught");
            
        }
    }
}
public class N12{
    public static void main(String[] args)
    {
        for(int i=0;i<8;i++){
            MultiThreadingTwo mt1=new MultiThreadingTwo();
            Thread t1=new Thread(mt1);
            t1.start();
            
            
        }
    }
}
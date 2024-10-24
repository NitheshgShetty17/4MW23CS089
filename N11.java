package pkg1;
class MultiThreadingOne extends Thread{
    public void run(){
        try{
 
            System.out.println("Thread"+Thread.currentThread().getId()+"is runnng");
        }
    
        catch (Exception e){
            System.out.println("Exception is caught");
            
        }
    }
}
public class N11{
    public static void main(String[] args)
    {
        for(int i=0;i<8;i++){
            MultiThreadingOne mt1=new MultiThreadingOne();
            mt1.start();
            
        }
    }
}
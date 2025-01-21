package ExceptionHandling;

class Error{
    void Arithmatic() throws Exception{
        int a=10/0;
    }
}
public class ExceptionThrows {
    public static void main (String[] args){
        Error er=new Error();
        try{
            er.Arithmatic();
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        finally{
            System.out.println("exit...");
        }
    }
}

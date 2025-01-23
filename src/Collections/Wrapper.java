package Collections;

public class Wrapper {
    public static void main(String[] args){
        int num=8;
        Integer num2=num;//autoboxing
        int num3=num2.intValue();//unboxing

        Integer num1=8;
        String str="123";
        int num4=Integer.parseInt(str);
        System.out.println(num4*2);

    }
}

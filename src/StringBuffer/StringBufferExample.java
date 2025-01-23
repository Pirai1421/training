package StringBuffer;
import java.util.*;
import java.util.regex.Pattern;

public class StringBufferExample {
    public static void main(String[] args){
        StringBuffer s= new StringBuffer("purchasing power");

        System.out.println(s.length());
        s.append(" corp");
        System.out.println(s);
        s.insert(0," ");
        System.out.println(s);
        String y=s.substring(6,10);
        System.out.println(y);
        String st=s.toString();
        System.out.println(st);
        String name="Pirai";
        String email="piraigps25@gmail.com";
        String phonenum="8838753048";
        System.out.println("valid email" + ivm(email));


    }
     public static boolean ipn(String phonenum){
        String number="^[0-9]+$";

        Pattern p=Pattern.compile(number);
        return p.matcher(phonenum).matches();

     }


     public static boolean ivn(String name){
        String n="^[A-Za-z]+$";
        Pattern p=Pattern.compile(n);
        return p.matcher(name).matches();
     }
     public static boolean ipm(String n){
        String h="^[A-za-z0-9._+]+$";
        Pattern p=Pattern.compile(h);
        return p.matcher(n).matches();
     }









    public static boolean ivm(String email){
        String emailr="^[A-za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern p=Pattern.compile(emailr);
        return p.matcher(email).matches();

    }
}

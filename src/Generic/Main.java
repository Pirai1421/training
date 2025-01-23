package Generic;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Person<String> p=new Person<>();
        Scanner s=new Scanner(System.in);
        Product<String,Integer,Double> pr1=new Product<>();
        pr1.setThings("laptop",30000,.3);
        System.out.println(pr1.item+" "+pr1.price+" "+pr1.offer);
        try {
            boolean valid=true;
            while(valid){
            p.setName(s.nextLine());
            if (validName(p.name)){
                valid=false;
                }

            }
        }

        catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println(e);
        }

        Person<String> p1=new Person<>();
        p1.setName("shiva");
        System.out.println("name "+p.getName());
        System.out.println("name of person "+p1.getName());


    }
    public static boolean validName(String name){
        String vname="^[A-za-z]+$";
        Pattern p=Pattern.compile(vname);
        return p.matcher(name).matches();

    }
}

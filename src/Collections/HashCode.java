package Collections;

import java.util.Objects;

public class HashCode {
    public static void main(String[] args){
        Laptop dell=new Laptop();
        int i = dell.hashCode();
        System.out.println(dell.toString());
        System.out.println(dell.hashCode());
        Laptop d=new Laptop();
        dell.model="dell";
        dell.price=10000;
        d.price=10000;
        d.model="dell";
        System.out.println(d.equals(dell));

    }
}
class Laptop{
    String model;
    int price;
    @Override
    public String toString(){
        return "DELL "+"Price";
    }
    public boolean equals(Laptop that){
        boolean b = this.model.equals(that.model) && this.price == that.price;
        return b;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}

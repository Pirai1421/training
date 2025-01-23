package Generic;

public class Product<T,U,V> {
    T item;
    U price;
    V offer;
    public void setThings(T item,U price,V offer){
        this.item=item;
        this.price=price;
        this.offer=offer;
    }
    public T getItem(){
        return this.item;

    }
    public U getPrice(){
        return this.price;

    }
    public V getOffer(){
        return this.offer;

    }

}

package polymorphism;
class Hotel{
    void eat(int a){
        System.out.println("Dosa");
    }
    void eat(double d){
        System.out.println("Idly");
    }
    void eat(char c){
        System.out.println("Vada");
    }
}

public class Program1{

    public static void main(String[] args) {
     Hotel h=new Hotel();
     h.eat(10);
     h.eat(13.99);
     h.eat('c');
    }
}

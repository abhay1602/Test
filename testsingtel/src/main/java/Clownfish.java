public class Clownfish extends Fish {

    String size;
    String make;

    Clownfish(String size,String make){
        this.size = size;
        this.make = make;
    }

    void sizeAndColor(){
        System.out.println("Clowfish is "+size+" and "+make);
    }
    void make(){
        System.out.println("make a "+ make);
    }
}

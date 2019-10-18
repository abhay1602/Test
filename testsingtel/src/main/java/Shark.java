public class Shark extends Fish {

    String size;
    String make;

    Shark(String size,String make){
        this.size = size;
        this.make = make;
    }

    void sizeAndColor(){
        System.out.println("Shark is "+size+" and "+make);
    }
    void make(){
        System.out.println("make a "+ make);
    }

}

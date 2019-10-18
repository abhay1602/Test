class Parrot extends Bird{

    String type;
    Parrot(String type){
        this.type=type;
    }
    void sing(){
        if (type.equals("Dog")){
            System.out.println("Woof, woof");
        }else if(type.equals("Cat")){
            System.out.println("Meow");
        }else if(type.equals("rooster")){
            System.out.println("Cock-a-doodle-doo");
        }

    }

}

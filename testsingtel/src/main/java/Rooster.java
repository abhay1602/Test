 class Rooster extends Bird{

    Chicken chicken;
    Rooster(Chicken chicken){
        this.chicken = chicken;
    }
    void sing(){
        System.out.println("Rooster -Cock-a-doodle-doo");
    }
    void flyRooster(){
        chicken.fly();
    }

}

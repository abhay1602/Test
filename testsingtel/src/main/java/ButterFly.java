public class ButterFly extends Bird {

    boolean caterpillar;
    ButterFly(boolean caterpillar){
        this.caterpillar = caterpillar;
    }

    void sing(){
        System.out.println("Cannot make noise");
    }

    void fly(){
        if(caterpillar){
            System.out.println("Cannot fly");
        }else {
            super.fly();
        }
    }

    void walk(){
        if(caterpillar){
            System.out.println("Can Crawl");
        }else {
            super.walk();
        }
    }
}

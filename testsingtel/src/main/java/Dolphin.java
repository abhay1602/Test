class Dolphin extends Animal{

    Fish fish;
    Dolphin(Fish fish){
        this.fish = fish;
    }

    void sing(){
        fish.sing();
    }

    void walk() {
       fish.walk();
    }

    void swim(){
        fish.swim();
    }
}

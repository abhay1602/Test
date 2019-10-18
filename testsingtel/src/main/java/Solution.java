public class Solution {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        Duck duck = new Duck();
        duck.swim();
        duck.fly();
        Parrot p = new Parrot("Cat");
        p.sing();
        Chicken chicken = new Chicken();
        chicken.sing();
        Rooster rooster = new Rooster(chicken);
        rooster.flyRooster();
        Fish fish = new Fish();
        fish.swim();
        fish.walk();
        fish.sing();
        Shark shark = new Shark("large","eat other fish");
        shark.make();
        shark.sizeAndColor();
        Clownfish claw = new Clownfish("small","joke");
        claw.sizeAndColor();
        claw.make();
        ButterFly butterFlyCat = new ButterFly(true);
        butterFlyCat.fly();
        ButterFly butterFly = new ButterFly(false);
        butterFly.fly();

    }

}

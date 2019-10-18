public class AnimalCount {

    public static int flyCount=0;
    public static int walkCount=0;
    public static int singCount=0;
    public static int swimCount=0;

   static Animal[] animals = new Animal[]{
            new Bird(),
            new Duck(),
            new Chicken(),
            new Shark("large","eat small fish"),
            new Parrot("Cat"),
            new Fish(),
            new Shark("large","eat small fish"),
            new Clownfish("small","joke"),
            new Rooster(new Chicken()),
            new ButterFly(true)
    };

    void count(Animal[] animals){
        for(Animal animal:animals){
            if(!(animal instanceof Chicken) && !(animal instanceof Rooster) &&(animal instanceof Bird)){
                flyCount++;
            }
            if((animal instanceof Fish) || (animal instanceof Duck)) {
                swimCount++;

            }
            if((animal instanceof Bird) && !(animal instanceof ButterFly)){
                singCount++;
                walkCount++;
            }
            if((animal instanceof ButterFly)){
                walkCount++;
            }

        }
    }

}
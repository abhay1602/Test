-Sing() method is implemented in the Bird class which is base for all the birds and birds who can sing can reuse it.
-Chicken has specific implementation for sing(),fly() and swim() method used from Bird class as bird can't swim generally.
-Duck has specific implementation for sing() and swim() as duck can swim and they sing differently.
-Rooster has specific implementation for sing() and it can reuse the chicken reference for fly() method and Bird class for swim() method.
-Parrot has used isntance variable for the interest of it living with, specific implementation can be provided for the parrot based on the value of the instance variable passed in the Parrot object constructor.
-Incase of new interest corrosponding implementation can be added in the same sing() method without affecting the existing code. we can resue the existing implementation for new interest by passing the existing interest in the Parrot constructor.
-Fish extends Animal as base and has specific implementation for the all the methods.
-Shark and ClawFish has size and make instance variable for size and make features.(Another way to have a getter and setter method)
-Butterfly extends bbird and uses fly() method from bird and has specific implentatation for the sing() method.
-Caterpillar is supported by adding the instance variable and accordingly Butterfly behaviour is implemented.
- Animal count is calculted based on the instance of the object in the array. 
- Few code has added to test the modal added.
- Second language support added for few sample languages with the Map and JAX-RS Rest annotation is added for creating the REST Endpoint.

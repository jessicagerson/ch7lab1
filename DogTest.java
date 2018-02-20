// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public  class DogTest
{
    public static void main(String[] args)
    {
        Dog dog = new Labrador("Dog", "black");
        Dog molly = new Labrador("Molly", "brown");
        Dog remi = new Yorkshire("Remi");
	System.out.println(dog.getName() + " says " + dog.speak());
	System.out.println(molly.avgBreedWeight());
	System.out.println(remi.avgBreedWeight());
    }
}

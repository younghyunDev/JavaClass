abstract class Birds extends Animal{
    //Override >> move >> they fly!
    @Override
    public void move(){
        System.out.println("I believe I can fly!");
    }
    //Override >> they usually eat worms!
    @Override
    public void eat(){
        System.out.println("We Eat Worms");
    }
}
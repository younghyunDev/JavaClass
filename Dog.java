class Dog extends Mammal{
    public void makenoise(){
        System.out.println("Woof Woof");
    }
    public void adulteat(){
        System.out.println("WE EAT MEAT");
        this.fullness +=1;
    }
    @Override
    public void math(){
        System.out.println("what do you expect woof");
    }

    public void move(){
        System.out.println("moving");
        this.fullness -=1;
    }

}
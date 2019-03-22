class Dog extends Mammal{
    public void makenoise(){
        System.out.println("Woof Woof");
    }
    //makenoise >> abstract
    public void adulteat(){
        System.out.println("WE EAT MEAT");
        this.fullness +=1;
    }
    //adulteat >> abstract
    @Override
    public void math(){
        System.out.println("what do you expect woof");
    }
    //math >> override
    public void move(){
        System.out.println("moving");
        this.fullness -=1;
    }
    //move >> abstract
}
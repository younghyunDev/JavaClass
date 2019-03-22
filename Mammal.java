class Mammal extends Animal{
    @Override
    public void math(){
        System.out.println("HUMAN-BEING?");
    }
    //math >> override
    public void eat(){
        if(this.age < 10){
            System.out.println("Breasting Feeding");
            this.fullness +=1;
        }
        else{
            this.adulteat();
        }
        //What other specific animal eat?? >> how to change
        //Think about it
    }
    //eat >> abstract
    //ABSTRACT을 하나 고정으로 만들어보장?
    //다른 문제는 나중에 생각해보자

    //뭔가 다른 것을 OVERRIDE하고 ABSTRACT으로 만들자
    //너무 애매하다
    public void btemperature(){
        System.out.println("I am pretty warm.");
    }
    //btemperarue >> abstract
    //Mammals are warm, and maybe some other animals aren't
    //so mammals are warm
    //others will state "i am cold" maybe
}
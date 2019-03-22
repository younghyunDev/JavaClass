abstract class Animal{
    int age;
    String Sex;
    String status = "awake";
    //나중에 이 status를 다른 방식으로 바꿔봐야지
    int fullness = 5;
    // 0 ~ 10, 0 being hungry >> maybe add starving to death and 10 beting full
    // full >> unable to eat
    abstract void btemperature();
    abstract void eat();
    abstract void adulteat();
    //the way animals eat can different from each other
    abstract void makenoise();
    //the same with this one, their sounds are unique
    public void sleep(){
        if (this.status == "dead"){
            this.death();
            return;
        }
        System.out.println("Starting to sleep");
        this.status = "asleep";
    }
    public void wakeup(){
        if (this.status == "dead"){
            this.death();
            return;
        }
        System.out.println("Waking up");
        this.status = "awake";
    }
    //if one goes to sleep, it cannot do anything;
    //therefore, it has to wake the animal up to do action
    //(*)뭔가 상태에 너무 많을 것을 넣었다.. 나중에 뺴자...
    public void death(){
        System.out.println("Your Animal is dead");
        this.status = "dead";
    }
    //TESTING!!
    public void math(){
        System.out.println("UNABLE TO SOLVE");
    }

}
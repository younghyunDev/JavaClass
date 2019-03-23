abstract class Animal{
    int age;
    String sex;
    String status = "awake";
    abstract void eat();
    abstract void makenoise();
    public void move(){
        if(this.statuscheck() == false){
        }else{
            System.out.println("어슬렁 어슬렁");
        }
    }
    public void sleep(){
        System.out.println("sleeping");
        this.status = "sleep";
    }
    public void wakeup(){
        System.out.println("waking up");
        this.status = "awake";
    }
    public boolean statuscheck(){
        if(this.status == "sleep"){
            System.out.println("sleeping, can't do");
            return false;
        } else{
            return true;
        }
    }

}
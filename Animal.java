abstract class Animal{
    int age;
    String sex;
    String status = "awake";
    abstract void eat();
    abstract void makenoise();
    abstract void move();
    public void sleep(){
        System.out.println("sleeping");
        this.status = "sleep";
    }
    public void wakeup(){
        System.out.println("waking up");
        this.status = "awake";
    }
}
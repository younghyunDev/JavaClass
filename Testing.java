public class Testing{
    public static void main(String[] args){
        Dog apeach = new Dog();
        Dog puffy = new Dog();
        apeach.age = 9;
        puffy.age = 11;
        apeach.btemperature();
        apeach.makenoise();
        apeach.math();

        System.out.println(puffy.fullness);        

        System.out.println("appech eat?");
        apeach.eat();
        System.out.println("puffy eat?");
        puffy.eat();

        System.out.println(puffy.fullness);

        puffy.move();

        System.out.println(puffy.fullness);
    }

}
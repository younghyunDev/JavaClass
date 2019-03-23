public class Testing{
    public static void main(String[] args) {
        Pigeon Azir = new Pigeon();
        Dog Corki = new Dog();
        Azir.age = 4;
        Corki.age = 5;
        Azir.sex = "female";
        Corki.sex = "female";
        //Mamml에서 정의(새로 정의)
        System.out.println("Corki Feed : ");
        Corki.feed();
        //Animal에서 정의(새로 정의)
        System.out.println("Corki Move : ");
        Corki.move();
        //Bird에서 정의(Override 정의)
        System.out.println("Azir Move : ");
        Azir.move();
        //Pigeon에서 정의(Abstract 구체화)
        System.out.println("Azir Makenoise : ");
        Azir.makenoise();
        //Dog에서 정의(Abstract 구체화)
        System.out.println("Corki Makenoise : ");
        Corki.makenoise();
        //Birds에서 정의(Abstract 구체화)
        System.out.println("Azir eat : ");
        Azir.eat();
        //Dog에서 정의(Abstract 구체화)
        System.out.println("Corki eat : ");
        Corki.eat();

    }
}
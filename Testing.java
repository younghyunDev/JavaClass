public class Testing{
    public static void main(String[] args) {
        Pigeon Azir = new Pigeon();
        Dog Corki = new Dog();
        Azir.age = 4;
        Corki.age = 5;
        Azir.sex = "female";
        Corki.sex = "female";
        System.out.println("Corki Feed : ");
        Corki.feed();
        System.out.println("Corki Move : ");
        Corki.move();
        System.out.println("Azir Move : ");
        Azir.move();
        System.out.println("Azir Makenoise : ");
        Azir.makenoise();
        System.out.println("Corki Makenoise : ");
        Corki.makenoise();
        System.out.println("Azir eat : ");
        Azir.eat();
        System.out.println("Corki eat : ");
        Corki.eat();

    }
}
public class TestHuman {
    public static void main(String[] args) {
        Human h1 = new Human(70, 190, "Blonde", "Oleg Povar");
        System.out.println(h1);
        h1.growUp(10);
        System.out.println();
        System.out.println(h1);
    }
}

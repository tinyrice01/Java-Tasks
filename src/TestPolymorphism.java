public abstract class TestPolymorphism implements Polymorphism {
    public static void main(String[] args) {
        Polymorphism[] array = new Polymorphism[] {
                new ClassOne(),
                new ClassTwo()
        };
        for (Polymorphism p: array) {
            p.printMessage();
        }
    }
}
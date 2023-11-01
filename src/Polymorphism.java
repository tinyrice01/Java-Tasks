interface Polymorphism {
    void printMessage();
    class ClassOne implements Polymorphism {
        public void printMessage() {
            System.out.println("dora");
        }
    }
    class ClassTwo implements Polymorphism {
        public void printMessage() {
            System.out.println("explorer");
        }
    }
}

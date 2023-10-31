package homework;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape oval = new Oval();
        Shape triangle = new Triangle();
        Shape diamond = new Diamond();

        ShapePrinter printer = new ShapePrinter();

        printer.printName(circle);
        printer.printName(quad);
        printer.printName(oval);
        printer.printName(triangle);
        printer.printName(diamond);
    }
}

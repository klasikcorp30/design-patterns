package edev.creationalpattersn.abstractfactory;

public abstract class AbstractFactory {
    abstract Colors getColor(String color);
    abstract Shape getShape (String shape);
}

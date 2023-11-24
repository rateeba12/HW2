package decorator;

public abstract class Decorators implements decoratorInterface {
    protected decoratorInterface decoratorinterface;

    protected Decorators (decoratorInterface decoratorinterface) {
        this.decoratorinterface = decoratorinterface;
    }

    public static void display(){

    }

}

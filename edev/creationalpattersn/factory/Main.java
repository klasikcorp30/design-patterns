package edev.creationalpattersn.factory;
;

public class Main {
    public static void main(String[] args) {
    OS os = new OSFactory().createOS("clark");

    os.specs();


    }
}

package edev.creationalpattersn.singleton;

public class SingletonMain {

    public static void main (String[] args) throws Exception{
        Singleton credentials = Singleton.getInstance(1234,"eepepep");
        Singleton credentials2 = Singleton.getInstance(123455,"FLELEORO");

        System.out.println(credentials);
        System.out.println(credentials2);

        System.out.println(credentials.hashCode());
        System.out.println(credentials2.equals(credentials));

        //Reflection


    }
}

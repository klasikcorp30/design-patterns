package edev.creationalpattersn.singleton;

public class Singleton {
    private static Singleton instance;
    private int id;
    private String password;

    private Singleton(int id, String password){
        this.id =  id;
        this.password = password;
    }

    public static Singleton getInstance (int id, String password){
        if (instance == null){
            instance = new Singleton(id,password);
        }
        return instance;
    }


    @Override
    public String toString(){
        return "The id entered is: "+this.id + " and the password entered is: "+ this.password;

    }
}

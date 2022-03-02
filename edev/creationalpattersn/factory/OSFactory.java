package edev.creationalpattersn.factory;

public class OSFactory {

    public OS createOS(String string){
        switch (string){
            case "android":
                return new Android();

            case "ios":
                return new IOS();

            case "windows":
                return new Windows();
            default:
                return new Android();
        }

    }
}

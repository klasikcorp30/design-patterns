package edev.creationalpattersn.builder;

public class Main {

    public static void main(String[] args) {
Phone phone = new PhoneBuilder().setBattery(2).setProcessor("Qualcomm").build();
        System.out.println(phone);
    }


}

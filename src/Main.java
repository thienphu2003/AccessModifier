public class Main {
    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        AccessModifier am2= new AccessModifier(3.0);
        System.out.println(am.getRadius());
        System.out.println(am2.getRadius());
        System.out.println(am.getArea());
        System.out.println(am2.getArea());
        System.out.println("Nai thúi");

    }
}
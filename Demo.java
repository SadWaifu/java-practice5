public class Demo {
    public static void main(String[] args) {
        Phone objPhone1 = new Iphone("XR");
        Phone objPhone2 = new Samsung("S20");

        objPhone1.toCall();
        objPhone2.toCall();

        System.out.println(objPhone1.getModel());
        System.out.println(objPhone2.getModel());
    }
}

public class Iphone extends Phone {
    @Override
    public void toCall() {
        System.out.println("Iphone call");
    }

    Iphone(String arg_model) {
        super(arg_model);
    }
}

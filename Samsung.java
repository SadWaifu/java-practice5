public class Samsung extends Phone {
    @Override
    public void toCall() {
        System.out.println("Samsung call");
    }

    Samsung(String arg_model) {
        super(arg_model);
    }
}

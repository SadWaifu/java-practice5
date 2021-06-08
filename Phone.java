public abstract class Phone {
    private String model;

    Phone(String arg_model) {
        model = arg_model;
    }

    public String getModel() {
        return model;
    }

    public abstract void toCall();
}

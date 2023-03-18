import HelloApp.HelloPOA;

public class HelloServer extends HelloPOA {
    @Override
    public String getListCustomer() {
        return "this will be list of customer";
    }

    @Override
    public String getDetailCustomer() {
        return "this will be detail of customer";
    }
}

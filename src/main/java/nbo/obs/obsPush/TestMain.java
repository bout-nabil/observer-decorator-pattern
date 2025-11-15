package nbo.obs;

public class TestMain {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();

        observable.addObserver(state -> {
            System.out.println("=============== Observer 1 =================");
            System.out.println("State updated to " + state);
            System.out.println("=============== ========== =================");
        });

        observable.setState(40);
        System.out.println("-------------------------------------");
        observable.setState(50);
    }
}

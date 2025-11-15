package nbo.obs.obsPop;

public class MainPop {
    public static void main(String[] args) {
        ObservablePopImpl observablePopImpl = new ObservablePopImpl();

        ObserverPopImpl1 observerPopImpl1 = new ObserverPopImpl1();
        ObserverPopImpl2 observerPopImpl2 = new ObserverPopImpl2();

        observablePopImpl.addObserverPop(observerPopImpl1);
        observablePopImpl.addObserverPop(observerPopImpl2);

        observablePopImpl.setState(10);
        System.out.println("--------------------------------------------------");
        observablePopImpl.setState(20);
        System.out.println("--------------------------------------------------");
        observablePopImpl.setState(30);
    }
}

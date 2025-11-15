package nbo.obs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Observable observable = new ObservableImpl();

        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        ((ObservableImpl) observable).setState(10);
        System.out.println("-------------------------------------");
        ((ObservableImpl) observable).setState(20);
        System.out.println("-------------------------------------");
        ((ObservableImpl) observable).setState(30);
    }
}
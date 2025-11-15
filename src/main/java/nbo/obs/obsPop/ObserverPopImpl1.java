package nbo.obs;

public class ObserverPopImpl1 implements ObserverPop {
    @Override
    public void update(Observable observable) {
        System.out.println("=============== ObserverPop 1 =================");
    }
}

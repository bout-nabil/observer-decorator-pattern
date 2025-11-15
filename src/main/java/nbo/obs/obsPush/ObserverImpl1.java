package nbo.obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int state) {
        System.out.println("=============== Observer 1 =================");
        System.out.println("ObserverImpl1: State updated to " + state);
        System.out.println("=============== ========== =================");
    }
}

package nbo.obs.obsPop;

public class ObserverPopImpl1 implements ObserverPop {
    @Override
    public void update(ObservablePop observablePop) {
        if (observablePop instanceof ObservablePopImpl obsPop) {
            //int state = ((ObservablePopImpl)observablePop).getState();
            int state = obsPop.getState();
            System.out.println("=============== ObserverPop 1 =================");
            System.out.println("ObserverPopImpl1: State updated to " + state);
            System.out.println("=============== ========== =================");
        }
    }
}

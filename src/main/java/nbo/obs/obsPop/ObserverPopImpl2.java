package nbo.obs.obsPop;

import java.util.ArrayList;
import java.util.List;

public class ObserverPopImpl2 implements ObserverPop {
    private List<Double> history = new ArrayList<>();
    @Override
    public void update(ObservablePop observablePop) {
        if (observablePop instanceof ObservablePopImpl observerPopImpl2) {
            //int state = ((ObservablePopImpl)observablePop).getState();
            int state = observerPopImpl2.getState();
            System.out.println("=============== ObserverPop 2 =================");
            history.add(Double.valueOf(state));
            System.out.println("History of states: " + history);
            System.out.println("ObserverPopImpl2: State updated to " + state);
            System.out.println("=============== ========== =================");
        }
    }
}

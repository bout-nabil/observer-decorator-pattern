package nbo.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    List<Double> history = new ArrayList<>();
    @Override
    public void update(int state) {
        System.out.println("=============== Observer 2 =================");
        history.add(Double.valueOf(state));
        System.out.println("History of states: " + history);
        System.out.println("ObserverImpl2: State updated to " + state);
        System.out.println("=============== ========== =================");
    }
}

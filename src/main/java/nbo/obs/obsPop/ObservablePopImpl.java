package nbo.obs;

import java.util.ArrayList;
import java.util.List;

public class ObservablePopImpl implements ObservablePop {
    List<ObserverPop> observersPop = new ArrayList<>();
    @Override
    public void addObserverPop(ObserverPop o) {
        observersPop.add(o);
    }

    @Override
    public void removeObserverPop(ObserverPop o) {
        observersPop.remove(o);
    }

    @Override
    public void notifyObserversPop() {
        for (ObserverPop o : observersPop) {}
    }

    public int getState() {
        return 0;
    }
}

package nbo.obs.obsPop;

import java.util.ArrayList;
import java.util.List;

public class ObservablePopImpl implements ObservablePop {
    private int state;
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
        for (ObserverPop o : observersPop) {
            o.update(this);
        }
    }

    public void setState(int state) {
        this.state = state;
        notifyObserversPop();
    }

    public int getState() {
        return state;
    }
}

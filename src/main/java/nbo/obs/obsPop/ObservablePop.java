package nbo.obs.obsPop;

public interface ObservablePop {
    void addObserverPop(ObserverPop o);
    void removeObserverPop(ObserverPop o);
    void notifyObserversPop();
}

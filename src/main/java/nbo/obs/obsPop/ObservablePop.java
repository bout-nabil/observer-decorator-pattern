package nbo.obs;

public interface ObservablePop {
    void addObserverPop(ObserverPop o);
    void removeObserverPop(ObserverPop o);
    void notifyObserversPop();
}

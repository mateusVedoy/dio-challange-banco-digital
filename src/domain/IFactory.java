package domain;

public interface IFactory<T1, T2> {
    T1 set(T2 entry);
}

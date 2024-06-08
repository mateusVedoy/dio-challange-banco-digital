package useCase;

public interface IExecutor <T1, T2> {
    T1 execute(T2 entry);
}

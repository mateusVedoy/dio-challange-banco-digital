package useCase;

import domain.Cadastramento;
import domain.Conta;
import domain.IFactory;

public class CriarConta implements IExecutor<Conta, Cadastramento> {

    IFactory<Conta, Cadastramento> factory;

    public CriarConta(IFactory<Conta, Cadastramento> factory) {
        this.factory = factory;
    }

    @Override
    public Conta execute(Cadastramento entry) {
        return this.factory.set(entry);
    }
}

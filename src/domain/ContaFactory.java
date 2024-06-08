package domain;

public class ContaFactory implements IFactory<Conta, Cadastramento>{
    @Override
    public Conta set(Cadastramento entry) {
        switch (entry.getTipoConta()) {

            case CONTA_CORRENTE -> {
                return new ContaCorrente(entry.getCliente());
            }
            case CONTA_POUPANCA -> {
                return new ContaPoupanca(entry.getCliente());
            }

            default -> {
                return null;
            }
        }
    }
}

package useCase;

import domain.Cliente;

public class CriarCliente implements IExecutor<Cliente, String>{
    @Override
    public Cliente execute(String entry) {
        return new Cliente(entry);
    }
}

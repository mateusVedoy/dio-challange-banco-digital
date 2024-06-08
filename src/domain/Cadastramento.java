package domain;

import lombok.Data;

@Data
public class Cadastramento {

    private TipoConta tipoConta;
    private Cliente cliente;

    public Cadastramento(
            TipoConta tipoConta,
            Cliente cliente
    ) {
        this.tipoConta = tipoConta;
        this.cliente = cliente;
    }

    public TipoConta getTipoConta() {
        return this.tipoConta;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
}

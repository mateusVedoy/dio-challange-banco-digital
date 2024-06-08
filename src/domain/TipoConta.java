package domain;

import lombok.Data;
import lombok.Getter;

public enum TipoConta {
    CONTA_CORRENTE ("CONTA_CORRENTE"),
    CONTA_POUPANCA ("CONTA_POUPANCA");

    @Getter
    private String value;

    private TipoConta(String value) {
        this.value = value;
    }
}

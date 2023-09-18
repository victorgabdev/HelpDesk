package com.victor.helpdesk.domain.enums;

public enum Status {

    ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");

    private Integer codigo;
    private String descricao;

    Status(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Status toEnum(Integer code) {
        if (code == null) return null;

        for (Status status : Status.values()) {
            if (code.equals(status.getCodigo())) return status;
        }

        throw new IllegalArgumentException("Status Inválido");
    }
}

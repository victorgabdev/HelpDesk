package com.victor.helpdesk.domain.enums;

public enum Perfil {
    ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");

    private Integer codigo;
    private String descricao;

    Perfil(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    // Perfil.toEmum(0)
    public static Perfil toEnum(Integer code) {
        if (code == null) return null;

        for (Perfil perfil : Perfil.values()) {
            if (code.equals(perfil.getCodigo())) return perfil;
        }

        throw new IllegalArgumentException("Perfil Inválido");
    }
}

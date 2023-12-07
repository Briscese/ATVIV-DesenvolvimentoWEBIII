package com.autobots.automanager.entidades;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class CredencialSemSenha extends Credencial {
    @Column
    private String nomeUsuario;

    public CredencialSemSenha(String tipo) {
        super(tipo);
    }

    @Override
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    @Override
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}

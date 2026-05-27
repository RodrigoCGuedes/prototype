package com.example.prototype.domain;

public class Motor implements Cloneable {
    private String tipo;
    private int cavalos;

    public Motor(String tipo, int cavalos) {
        this.tipo = tipo;
        this.cavalos = cavalos;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCavalos() {
        return this.cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    @Override
    public Motor clone() throws CloneNotSupportedException {
        return (Motor) super.clone();
    }
}
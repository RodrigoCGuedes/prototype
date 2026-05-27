package com.example.prototype.domain;

public class Veiculo implements Cloneable {
    private String modelo;
    private String cor;
    private Motor motor;

    public Veiculo(String modelo, String cor, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public Veiculo clone() throws CloneNotSupportedException {
        Veiculo veiculoClone = (Veiculo) super.clone();
        veiculoClone.motor = this.motor.clone();
        return veiculoClone;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio_dio;

/**
 *
 * @author Diogo
 */
public abstract class Conta implements Iconta {
    
    protected int agencia;
    protected int conta = 1000;
    protected static int inc =1;
    protected boolean tipo;
    protected double saldo;
    
    
    

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta() {
        this.conta = conta+inc;
        this.inc ++;
    }

    public int getInc() {
        return inc;
    }

    public void setInc(int inc) {
        this.inc = inc;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public String toString() {
        return "Conta{" + "agencia=" + agencia + ", tipo=" + tipo + ", saldo=" + saldo + '}';
    }
    
    
    
    
    
    
    
    public abstract void sacar(double v);
    
    public abstract void depositar(double v);
    
    public abstract void transferir(double v, Conta d);
    
    
    
    
    
    
    
    
    
    
}

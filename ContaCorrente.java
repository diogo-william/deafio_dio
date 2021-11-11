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
public class ContaCorrente extends Conta {
    
    
    Cliente cliente;
    
    public ContaCorrente(int a, double s, Cliente cliente)
    {
    super.agencia =  a;
    super.setConta();
    super.saldo = s;
    super.tipo = true;
    this.cliente = cliente;
    
    
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    
    
    @Override
    public void sacar(double v)
    {
    super.setSaldo(super.getSaldo() - v);  
    }
    
    @Override
    public void depositar(double v)
    {
    super.setSaldo(super.getSaldo()+v);
    
    }
    
    @Override
    public void transferir(double v, Conta d)
    {
    this.sacar(v);
    d.depositar(v);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "cliente=" + cliente + super.toString()+ '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}

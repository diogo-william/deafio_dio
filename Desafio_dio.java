
package desafio_dio;


import java.util.*;


/**
 *
 * @author Diogo
 */
public class Desafio_dio {

public static void main(String[] args) {
    
    
    Cliente c1 = new Cliente ();
    c1.setNome("jose");
    c1.setCpf(1111111111);
    c1.setTelefone(222222222);
    
    
    Cliente c2 = new Cliente ();
    c2.setNome("Regina");
    c2.setCpf(1111111111);
    c2.setTelefone(222222222);
    
    
    
    
    int ag1 = 121;
    
    int ag2 = 155;
    
    
    double s1 = 1000.00;
    double s2 = 100.00;
    
    ContaCorrente cc = new ContaCorrente(ag1, s1, c1);
    ContaPoupanca cp = new ContaPoupanca(ag2, s2, c2);
    
    
    
    System.out.println(cc.toString());
    
    
    cc.depositar(100.50);
   
    System.out.println(cc.getSaldo());
    
    cc.sacar(500.25);
    
    System.out.println(cc.getSaldo());
    
    cc.transferir(100.25, cp);
    
    System.out.println(cc.getSaldo()+" n conta"+ cc.getConta());
    System.out.println(cp.getSaldo()+" n conta"+cp.getConta());
    
    
    
    
    
    
    
    
}
    

    
}


package Reglas;

public class Cuenta {
    protected double balance = 0;
    
    
    public void depositar(double consignacion) {
        
        balance = balance + consignacion;  
    }

    public void retirar(double retiro) {
            balance = balance - retiro;   
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

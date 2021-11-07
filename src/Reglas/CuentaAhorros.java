package Reglas;
public class CuentaAhorros extends Cuenta {
private final double tasaIntereses = 1;

@Override
public double getBalance(){
    
    balance = balance+(balance* tasaIntereses/100)/12;

    return balance;
}

@Override
public void retirar(double retiro)
{
    if(balance-retiro >= 0)
    {
        balance = balance - retiro;
    }
    else
    {
        System.out.println("Sus fondos son insuficientes para el retiro");
        System.out.println("Su balance actual es de "+balance);
        
    }
    
}




}
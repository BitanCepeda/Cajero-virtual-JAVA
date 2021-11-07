package Reglas;
public class CuentaCorriente  extends Cuenta{
    private final double tasaIntereses = 3;
    private final double cupo = 100000;
    @Override
    public double getBalance(){
        balance = balance+(balance* tasaIntereses/100)/12;
        return balance;
    }
  
    
    @Override
public void retirar(double retiro)
{
    if(balance-retiro >= -100000)
    {
        balance = balance - retiro;
    }
    else
    {
        System.out.println("Sus fondos son insuficientes para el retiro");
        System.out.println("Su cupo actual es de " + (cupo+balance));
        System.out.println("Su balance actual es de "+balance);
        
    }
    
}
}    

package ec.edu.espoch.cuentabancaria.cuentas;

public class CuentaAhorros extends Cuenta{
    
    protected boolean activa;
    
    public CuentaAhorros (float saldo, float tasaAnual ){
        super(saldo, tasaAnual);
        this.activa = true;                 
    }
    @Override
        public boolean consignar (float cantidad){
        return false;
    }
    @Override
    public boolean retirar (float cantidad){
        return false;
    }
    @Override
    public void calcularInteres(){
    
    }    
    @Override
    public void extractoMensual (){
        
    }
    @Override
    public void imprimir(){
        
    }

    @Override
    public String toString() {
        return "CuentaAhorros{" + super.toString() + "activa=" + activa + '}';
    }
}

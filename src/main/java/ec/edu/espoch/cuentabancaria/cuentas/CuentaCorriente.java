
package ec.edu.espoch.cuentabancaria.cuentas;

public class CuentaCorriente extends Cuenta {
    protected float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
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
        return "CuentaCorriente{" + "sobregiro=" + sobregiro + '}';
    }
    
}

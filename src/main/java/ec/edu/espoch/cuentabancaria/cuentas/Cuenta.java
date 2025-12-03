
package ec.edu.espoch.cuentabancaria.cuentas;

public class Cuenta {
protected float saldo;
protected int consignaciones = 0;
protected int retiros;
protected float tasaAnual;
protected float comusionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public boolean consignar (float cantidad){
        return false;
    }
    public boolean retirar (float cantidad){
        return false;
    }
    public void calcularInteres(){
    
    }    
    public void extractoMensual (){
        
    }
    public void imprimir(){
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", consignaciones=" + consignaciones + ", retiros=" + retiros + ", tasaAnual=" + tasaAnual + ", comusionMensual=" + comusionMensual + '}';
    }
    
}    


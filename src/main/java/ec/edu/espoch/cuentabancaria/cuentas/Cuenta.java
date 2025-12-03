
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
        
    saldo=saldo+cantidad;
        return true;
    }
    public boolean retirar (float cantidad){
        boolean respuesta=false;
        if (cantidad > 0 && saldo >= cantidad){
        saldo = saldo - cantidad;
        respuesta = true;
        }
    return respuesta;
    }

    public float calcularInteres(){
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo*(tasaAnual/100);
        saldo = interesMensual + saldo;
        return tasaMensual;
    
    }    
    public void extractoMensual (){
    }
    public void imprimir(){
        System.out.println("saldo: "+ saldo);
        System.out.println("consignacion"+ consignaciones);
        System.out.println("retiros"+retiros);
        System.out.println("tasa anual"+tasaAnual);
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", consignaciones=" + consignaciones + ", retiros=" + retiros + ", tasaAnual=" + tasaAnual + ", comusionMensual=" + comusionMensual + '}';
    }
    
}    


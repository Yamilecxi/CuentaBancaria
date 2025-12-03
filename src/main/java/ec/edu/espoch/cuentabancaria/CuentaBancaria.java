
package ec.edu.espoch.cuentabancaria;

import ec.edu.espoch.cuentabancaria.cuentas.CuentaAhorros;

public class CuentaBancaria {

    public static void main(String[] args) {
        
        CuentaAhorros cuentaAhorros = new CuentaAhorros(5, 10);
        System.out.println(cuentaAhorros.toString());
                
    }
}

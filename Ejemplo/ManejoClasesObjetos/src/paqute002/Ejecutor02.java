
package paqute002;
import paquete001.FacturaTelefono;

/**
 *
 * @author SALA I
 */
public class Ejecutor02 {
    
    public static void main(String[] args) {
        FacturaTelefono telefono = new FacturaTelefono();
        
        telefono.establecerNumeroTelefono("099873657");
        telefono.establecerMinutosMes(30);
        telefono.establecerValorMinuto(0.15);
        
        System.out.printf("Factura de Teléfono\n\n\tNúmero de teléfono: %s\n"
                + "Minutos mensuales: %.2f\n\tValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", telefono.obtenerNumeroTelefono(),
                telefono.obtenerMinutosMes(), telefono.obtenerValorMinuto(),
                telefono.obtenerValorFactura());
        
    }
    
}

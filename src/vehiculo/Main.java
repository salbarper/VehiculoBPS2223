
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        Vehiculo miVehiculo;
        int stockActual;
        
        stockActual = operativaVehiculosBPS2223(50);
        System.out.println("El stock actual es"+ stockActual );
    }

    private static int operativaVehiculosBPS2223(int cantidad) {
        Vehiculo miVehiculo;
        int stockActual;
        miVehiculo = new Vehiculo("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculo.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculo.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculo.obtenerStock();
        return stockActual;
    }

}
    

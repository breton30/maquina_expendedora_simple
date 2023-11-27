public class MaquinaExpendedoraSimple {
    
    // El precio del billete
    private int precioBillete;
    // La cantidad de dinero que lleva metida el cliente actual
    private int balanceClienteActual;
    // El total de dinero almacenado en la maquina desde su ultimo vaciado
    private int totalDineroAcumulado;
    // El origen del billete
    private String estacionOrigen;
    // El destino del billete
    private String estacionDestino;
    //Reduce el precio del billete
    private int CambiarPrecioBillete;
    
    /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete y el origen y destino dados. Se asume que el precio
     * del billete que se recibe es mayor que 0.
     */
    public MaquinaExpendedoraSimple(int precioDelBillete, String origen, String destino) {
        precioBillete = precioDelBillete = 20;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "Leon";
        estacionDestino = "Madrid";
        
    }
    /**
     * Segundo constructor
     */
    public MaquinaExpendedoraSimple(int precioDelBillete,String destino) {
        precioBillete= precioDelBillete;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "Leon";
        estacionDestino= destino;
        
        
        
    }
    /**
     * Devuelve el precio del billete
     */
    public int getPrecioBillete() {
        return precioBillete;
    }
    /**
     * Total Dinero
     */
    public int getTotalDineroAcumulado() {
        return totalDineroAcumulado;
    }
    /**
     * Devuelve la cantidad de dinero que el cliente actual lleva introducida
     */
    public int getBalanceClienteActual() {
        return balanceClienteActual;
    }
    /**
     * Setter precio billete
     */
    public void setPrecioBillete(int CambiarPrecioBillete) {
        precioBillete = CambiarPrecioBillete;
    }
    /**
     * Simula la introduccion de dinero por parte del cliente actual
     */
    public void introducirDinero(int cantidadIntroducida) {
        balanceClienteActual = balanceClienteActual + cantidadIntroducida;
    }
    /**
     * Reduce el precio del billete
     */
    public void reducirPrecioBillete(int reducirPrecio) {
        precioBillete = precioBillete - reducirPrecio;
    }
    /**
     * Extraer Dinero
     */
    public void vaciarDepositoDinero (){
        totalDineroAcumulado= 0;
        
    }
    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        // Simula la impresion de un billete
        System.out.println("##################");
        System.out.println("# Billete de tren:");
        System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
        System.out.println("# " + precioBillete + " euros.");
        System.out.println("##################");
        System.out.println();

        // Actualiza el total de dinero acumulado en la maquina
        totalDineroAcumulado = totalDineroAcumulado + balanceClienteActual;
        // Queda preparada para el proximo cliente
        balanceClienteActual = 0;
    }
}

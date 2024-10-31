public class Planeta {
    // Atributos
    private String nombre;
    private int cantidadSatelites;
    private double masa; // en kilogramos
    private double volumen; // en km^3
    private int diametro; // en km
    private int distanciaAlSol; // en millones de km
    private TipoPlaneta tipo; // Usamos la enumeración TipoPlaneta
    private boolean observable;

    private static final double UA_EN_KM = 149.597870; // Valor de una UA en millones de km

    // Constructor
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaAlSol, TipoPlaneta tipo, boolean observable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.tipo = tipo;
        this.observable = observable;
    }

    // Metodo para calcular la densidad
    public double calcularDensidad() {
        return volumen != 0 ? masa / volumen : 0;
    }

    // Metodo para determinar si es un planeta exterior
    public boolean esExterior() {
        double distanciaEnUA = distanciaAlSol / UA_EN_KM;
        return distanciaEnUA > 1.5; // Se considera exterior si está más allá de Marte
    }

    // Metodo para imprimir los atributos del planeta
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al Sol: " + distanciaAlSol + " millones de km");
        System.out.println("Tipo de Planeta: " + tipo);
        System.out.println("Observable a simple vista: " + (observable ? "Sí" : "No"));
        System.out.println("Densidad: " + calcularDensidad() + " kg/km³");
        System.out.println("Es un planeta exterior: " + (esExterior() ? "Sí" : "No"));
        System.out.println();
    }
}

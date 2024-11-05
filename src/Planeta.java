enum tipoPlaneta {
    GASEOSO, TERRESTRE, ENANO
}
public class Planeta {
    String nombre = null;
    int cantidadSatelites = 0;
    double masaKilogramo = 0;
    double volumenKilometrosCubicos = 0;
    int diametro = 0;
    int distanciaSol = 0;
    String tipoPlaneta;
    boolean observableVista = false;
    double periodoOrbital;
    double periodoDeRotacion;

    public Planeta(String nombre, int cantidadSatelites, double masaKilogramo, double volumenKilometrosCubicos, int diametro, int distanciaSol, String tipoPlaneta, boolean observableVista, double periodoOrbital, double periodoDeRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masaKilogramo = masaKilogramo;
        this.volumenKilometrosCubicos = volumenKilometrosCubicos;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.observableVista = observableVista;
        this.periodoOrbital = periodoOrbital;
        this.periodoDeRotacion = periodoDeRotacion;
    }
    public void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Cantidad de Satelites = " + cantidadSatelites);
        System.out.println("Masa = "+ masaKilogramo);
        System.out.println("Volumen = " + volumenKilometrosCubicos);
        System.out.println("Diametro = " + diametro);
        System.out.println("Distancia al Sol = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipoPlaneta);
        System.out.println("Se puede observar a simple vista = " + observableVista);
        System.out.println("El periodo orbital del planeta (en años) es de = " + periodoOrbital);
        System.out.println("El periodo de rotacion (en dias) es de = " + periodoDeRotacion);
    }

    public double calcularDensidad () {
        return masaKilogramo / volumenKilometrosCubicos;

    }
    public boolean esPlanetaExterior () {
        return distanciaSol > 508632758;  //Seria 149597870 km seria una unidad de UA, como esta a 3.4 UA lo multiplique
    }
    public static void main(String[] args) {

        Planeta p1 = new Planeta("Tierra",1,5.9736E24,1.08321e12,12742,150000000,"TERRESTRE",true, 1,1);
        Planeta p2 = new Planeta("Jupiter",1,1.899e27,1.4313e15,139820,750000000, "GASEOSO",true, 11.86,0.413);

        p1.imprimir();
        System.out.println("Densidad del planeta " + p1.nombre + " es de = " + p1.calcularDensidad());
        System.out.println("Es planeta del exterior el planeta " + p1.nombre + "? " + p1.esPlanetaExterior());

        System.out.println();

        p2.imprimir();
        System.out.println("Densidad del planeta " + p2.nombre + " es de = " + p2.calcularDensidad());
        System.out.println("Es planeta del exterior el planeta " + p2.nombre + "? " + p2.esPlanetaExterior());
    }

}
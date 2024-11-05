public class Persona {
    String nombre;
    String apellido;
    String numeroDocumentoIdentidad;
    int anioNacimiento;
    String pais;
    char genero;


    public Persona(String nombre, String apellido, String numeroDocumentoIdentidad, int anioNacimiento,String pais, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.pais = pais;
        this.genero = genero;
    }
    public void imprimir () {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Numero de documento de identidad = " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + anioNacimiento);
        System.out.println("Pais de nacimiento = " + pais);
        System.out.println("Genero (H o M) = " + genero);
        System.out.println();
    }
    public static void main(String args[]) {
        Persona p1 = new Persona("Pedro","Perez","1053121010",1998,"Mexico",'H');
        Persona p2 = new Persona("Luis","Leon","1053223344",2001, "Mexico",'H');
        p1.imprimir();
        p2.imprimir();
    }
}

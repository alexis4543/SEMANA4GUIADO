public class Dispositivo {
    private String nombre;
    private String tipo;
    private static int contador = 0;

    //setter
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            System.out.println("El nombre no puede estar en blanco ni ser nulo");
        }else{
            this.nombre = nombre;
        }
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.isBlank()){
            System.out.println("El tipo no puede estar en blanco ni ser nulo");
        }else{
            this.tipo = tipo;
        }
    }

    //getter


    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Dispositivo(String nombre, String tipo) {
        // Usamos los setters para aplicar las validaciones desde el nacimiento
        setNombre(nombre);
        setTipo(tipo);
        contador++;
    }

    //metodos
    public static int getTotalCreados() {
        return contador;
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("El numero de objetos es: " +Dispositivo.getTotalCreados());
    //CREAMOS OBAJETOS CON CONSTRUCTORES
    Dispositivo d1 = new Dispositivo("Dispositivo 1","Celular");
    Dispositivo d2 = new Dispositivo("Dispositivo 2","Ipad");
    Dispositivo d3 = new Dispositivo("Dispositivo 3","Compu");
    System.out.println("El numero de objetos es: " +Dispositivo.getTotalCreados());
    System.out.println();


    System.out.println("INFORMACION DISPOSITIVO ");
    if (d1.getNombre() == null){
        System.out.println("ERROR");
    }
    System.out.println("El nombre del dispositivo  es: "+d1.getNombre());
    System.out.println("El tipo del dispositivo 1 es: "+d1.getTipo());
    System.out.println();
    System.out.println("INFORMACION DISPOSITIVO ");
    System.out.println("El nombre del dispositivo  es: "+d2.getNombre());
    System.out.println("El tipo del dispositivo 2 es: "+d2.getTipo());

    System.out.println();
    System.out.println("INFORMACION DISPOSITIVO ");
    System.out.println("El nombre del dispositivo  es: "+d3.getNombre()+" y el tipo es: "+d3.getTipo());
    //System.out.println("El tipo del dispositivo 3 es: "+d3.getTipo());
}


 
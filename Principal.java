package practica1;

public class Principal{
    public static void main (String[] args){
       
        Datos persona = new Datos("Juan", 25, "juanito@hotmail.com");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Correo: " + persona.getCorreo());

    }
}
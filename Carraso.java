package practica1;

public class Carraso {
    public static void main(String[] args) {
        informacion carro = new informacion("azul", 2010, "normales", 5);

        System.out.println("Color: " + carro.getcolor());
        System.out.println("Año: " + carro.getaño());
        System.out.println("Ventanas: " + carro.getventanas());
        System.out.println("Llantas: " + carro.getllantas());
    }
}

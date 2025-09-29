package practica1;

public class informacion {
    private String color;
    private int año;
    private String ventanas;
    private int llantas;

    public informacion (String color, int año, String ventanas, int llantas) {
        this.color = color;
        this.año = año;
        this.ventanas = ventanas;
        this.llantas = llantas;
    }

    public informacion(){}

    public String getcolor(){
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public int getaño(){
        return año;
    }

    public void setaño(int año) {
        this.año = año;
    }

    public String getventanas(){
        return ventanas;
    }

    public void setventanas(String ventanas){
        this.ventanas = ventanas;
    }

    public int getllantas(){
        return llantas;
    }

    public void setllantas(int llantas){
        this.llantas = llantas;
    }
}

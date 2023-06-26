
import java.util.Random;

public class Cafe {
    private double gramos;
    private double agua;
    private String tamano;
    private int valor;
    public Cafe(double gramos, double agua, String tamano){
        Random random = new Random();
        this.setGramos(gramos);
        this.setAgua(agua);
        this.setTamano(tamano);
        this.valor = random.nextInt(1,99);
    }
    public void setGramos(double gramos) {
        this.gramos = gramos;
    }
    public void setAgua(double agua) {
        this.agua = agua;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public double getGramos() {
        return gramos;
    }
    public double getAgua() {
        return agua;
    }
    public String getTamano() {
        return tamano;
    }
    public String toString(){
        String string = "Cafe contiene: "+this.gramos+"gr- "+this.agua+"ml- es de tamano "+this.tamano+" con un valor de $"+this.valor+" dolares";
        return string;
    }

}


import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private String direccion;
    private String redesSociales;
    private ArrayList<Cafe> listaDeCafes = new ArrayList<>();

    public Cafeteria(String nombre, String direccion, String redesSociales){
        this.nombre = nombre;
        this.direccion = direccion;
        this.redesSociales = redesSociales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setRedesSociales(String redesSociales) {
        this.redesSociales = redesSociales;
    }
    public void setListaDeCafes(ArrayList listaDeCafes) {
        this.listaDeCafes = listaDeCafes;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getRedesSociales() {
        return redesSociales;
    }
    public ArrayList getListaDeCafes() {
        return listaDeCafes;
    }
    public void agregarCafe(Double gramos, Double agua, String tamano) {
        Cafe cafe0 = new Cafe(gramos, agua, tamano);
        this.listaDeCafes.add(cafe0);
    }

    public void mostrarCafes(){
        if (this.listaDeCafes.isEmpty()){
            System.out.println("Lista de cafes esta vacia");
        }
        else {
            int i = 0;
            for (Cafe element : listaDeCafes) {
                System.out.println("["+(i+1)+"]"+element.toString());
                i++;
            }
        }
    }

    public void borrarCafe(int i){
        listaDeCafes.remove(i-1);
    }

    public void buscarCafePorTamano(String tamano){
        for (Cafe element: listaDeCafes){
            if(element.getTamano() == tamano){
                System.out.println(element.toString());
            }
        }
    }

}

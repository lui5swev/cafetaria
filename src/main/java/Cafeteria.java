import java.io.*;
import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private String direccion;
    private String redesSociales;
    private ArrayList<Cafe> listaDeCafes = new ArrayList<>();
    private ArrayList<Alfajor> listaDeAlfajores = new ArrayList<>();
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
    public void agregarAlfajor(String sabor, String tamano) {
        Alfajor alfajor0 = new Alfajor(sabor, tamano);
        this.listaDeAlfajores.add(alfajor0);
    }
    public void borrarAlfajor(int i){
        listaDeAlfajores.remove(i-1);
    }

    private static void writeLine(BufferedWriter writer, String[] data) throws IOException {
        for (int i = 0; i < data.length; i++) {
            if (i != 0) {
                writer.write(",");
            }
            writer.write(data[i]);
        }
        writer.newLine();
    }
    public void anadirCompraALibro(Cafe cafe) {
        String filePath = "C:\\Users\\Luis\\IdeaProjects\\trabajoCafeteria\\src\\main\\java\\libroVentas.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            String[] content = new String[]{cafe.toString()};
            writeLine(writer, content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void comprarCafe(Double gramos, Double agua, String tamano){
        Cafe cafe0 = new Cafe(gramos, agua, tamano);
        anadirCompraALibro(cafe0);
        System.out.println("SU COMPRA: "+cafe0.toString());
    }

    public void mostrarLibroVentas(){
        String filePath = "C:\\Users\\Luis\\IdeaProjects\\trabajoCafeteria\\src\\main\\java\\libroVentas.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("-------------------------------");
            System.out.println("LIBRO DE VENTAS");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

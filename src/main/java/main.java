public class main {
    public static void main(String[] args) {
        Cafeteria cafeteria1 = new Cafeteria("Puzzles", "arturo prat 22", "@puzzles");

        cafeteria1.mostrarCafes();

        cafeteria1.agregarCafe(34.5, 13.6, "mediano");
        cafeteria1.agregarCafe(36.4, 45.4, "grande");
        cafeteria1.agregarCafe(85.7, 34.4, "grande");
        cafeteria1.agregarCafe(34.0, 12.5, "pequeno");
        cafeteria1.agregarCafe(54.8, 23.4, "mediano");
        cafeteria1.agregarCafe(8.5, 4.4, "grande");

        cafeteria1.mostrarCafes();

        cafeteria1.borrarCafe(5);

        cafeteria1.mostrarCafes();

        cafeteria1.buscarCafePorTamano("grande");

        cafeteria1.comprarCafe(8.5, 4.5, "mediano");
        cafeteria1.comprarCafe(6.1, 10.4, "pequeno");
        cafeteria1.comprarCafe(8.0, 3.4, "grande");
        cafeteria1.comprarCafe(2.4, 7.43, "mediano");

        cafeteria1.mostrarLibroVentas();



    }

}

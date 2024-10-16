//Ejercicio 1 - Tarea 2
class Jugador {
    // Atributos de la clase Jugador
    private String nombre;
    private String posicion;
    private int edad;
    private int numeroCamiseta;

    // Constructor de la clase Jugador
    public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
    }

    // Metodo para mostrar la información del jugador
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Número de camiseta: " + numeroCamiseta);
        System.out.println();
    }

    // Metodo principal para crear objetos y mostrar su información
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Lionel Messi - La cabra", "Delantero", 36, 10);
        Jugador jugador2 = new Jugador("Cristiano Ronaldo - El acabado", "Banco", 39, 7);
        Jugador jugador3 = new Jugador("Neymar - El rey", "Delantero", 32, 10);

        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();
        jugador3.mostrarInformacion();
    }
}

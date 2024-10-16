public class Libro {
    String titulo;
    String autor;
    int paginaCount;

    public Libro(String tituloLibro, String autorLibro, int paginas) {
        titulo = tituloLibro;
        autor = autorLibro;
        paginaCount = paginas;
    }
    public String informarcionLibro() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nPaginas: " + paginaCount;
    }
    public static void main(String[] args) {
        Libro primerLibro = new Libro("\"Matar a un ruiseñor\" (To Kill a Mockingbird)", "Harper Lee", 281);
        Libro segundoLibro = new Libro("1984", "George Orwell", 328);

        System.out.println(primerLibro.informarcionLibro());
        System.out.println();
        System.out.println(segundoLibro.informarcionLibro());
    }
}
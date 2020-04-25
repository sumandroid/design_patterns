package structural.bridge;

public class DriverClass {

    public static void main(String []args){
        Movie movie = new Movie();
        movie.setTitle("john wick");
        movie.setCategory("thriller");
        movie.setRunTime("2:15");
        Formatter printFormatter = new PrintFormatter();
        Printer printer = new MoviePrinter(movie);
        String printedMaterial = printer.print(printFormatter);
        System.out.print(printedMaterial);
    }
}

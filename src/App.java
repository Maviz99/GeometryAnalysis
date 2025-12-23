import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        PerimeterRunner pr = new PerimeterRunner();
        
        // Test-Daten manuell erstellen (ohne Datei-Stress für den Anfang)
        List<Point> triangle = new ArrayList<>();
        triangle.add(new Point(0, 0));
        triangle.add(new Point(6, 0));
        triangle.add(new Point(3, 6));

        double peri = pr.getPerimeter(triangle);
        System.out.println("Der Umfang ist: " + peri);
    }
    }


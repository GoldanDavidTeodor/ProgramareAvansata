import models.ImageItem;
import repository.ImageRepository;
import exceptions.ImageNotFoundException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        ImageRepository repository = new ImageRepository();

        ImageItem img1 = new ImageItem("galaxy", LocalDate.now(), List.of("space", "galaxy"), Path.of("C:\\Users\\David\\Desktop\\galaxy.jpg"));
        repository.addImage(img1);

        try {
            repository.displayImage("galaxy");
        } catch (ImageNotFoundException | IOException variable) {
            System.err.println("Error: " + variable.getMessage());
        }

        try {
            repository.displayImage("wow"); // nu exista --> Error: Image not found: wow
        } catch (ImageNotFoundException | IOException variable) {
            System.err.println("Error: " + variable.getMessage());
        }
    }
}

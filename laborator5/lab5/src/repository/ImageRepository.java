package repository;

import models.ImageItem;
import exceptions.ImageNotFoundException;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ImageRepository {
    private final List<ImageItem> images = new ArrayList<>();

    public void addImage(ImageItem image) {
        images.add(image);
    }

    public ImageItem findImage(String name) throws ImageNotFoundException {
        return images.stream()
                .filter(img -> img.name().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new ImageNotFoundException("Image not found: " + name));
    }

    public void displayImage(String name) throws ImageNotFoundException, IOException {
        ImageItem image = findImage(name);
        Path filePath = image.location();

        if (!Files.exists(filePath)) {
            throw new IOException("File not found: " + filePath);
        }

        Desktop.getDesktop().open(filePath.toFile());
    }
}

package models;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public record ImageItem(String name, LocalDate date, List<String> tags, Path location) {
    public ImageItem {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Image name shouldn't be null or empty.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Image location shouldn't be null.");
        }
    }
}

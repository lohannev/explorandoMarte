package mars.rover;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Grid {

    private final String width;
    private List<Integer> position;
    private List<Integer> probes;
    private List<Movement> movements;
    private int height;

    public Grid(Integer width, java.lang.String width1) {
        this.width = width1;
    }

    public static Grid valueOf(java.lang.String width, int height) {
        return new Grid(width, height);
    }

    public static Grid valueOf(String width, String height) {
        Integer.valueOf(height);
        return new Grid(Integer.valueOf(width), width);

    }

    public Grid(java.lang.String width, int height) {
        this.height = height;
        this.width = width;
        this.probes = new ArrayList<>();
        this.position = new ArrayList<>();
    }

    public String getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private Collection<Object> movements() {
        return null;
    }
}

import processing.core.PApplet;

public class DrawingApp extends PApplet {

    public static void main(String[] args) {
        PApplet.main("DrawingApp");
    }

    public void settings() {
        size(600, 400);
    }

    public void setup() {
        drawCompositeObject(100, 100, 50, color(255, 0, 0)); // Drawing a red house at (100, 100) with size 50
    }

    public void draw() {
        // Any dynamic elements or animations can go here
    }

    // Method to draw a composite object at specified location with specified size and color
    public void drawCompositeObject(float x, float y, float size, int color) {
        drawHouse(x, y, size, color);
        drawStickFigure(x + size * 2, y, size, color);
    }

    // Method to draw a house at specified location with specified size and color
    public void drawHouse(float x, float y, float size, int color) {
        fill(color);
        rect(x, y, size, size); // Base
        triangle(x, y, x + size / 2, y - size / 2, x + size, y); // Roof
    }

    // Method to draw a stick figure at specified location with specified size and color
    public void drawStickFigure(float x, float y, float size, int color) {
        fill(color);
        ellipse(x, y - size / 4, size / 2, size / 2); // Head
        line(x, y, x, y + size); // Body
        line(x, y + size, x - size, y + size * 2); // Left leg
        line(x, y + size, x + size, y + size * 2); // Right leg
        line(x, y + size / 2, x - size / 2, y); // Left arm
        line(x, y + size / 2, x + size / 2, y); // Right arm
    }

    // Method to calculate x-coordinate for centering an object on the screen
    public float centerX(float objWidth) {
        return (width - objWidth) / 2;
    }

    // Method to calculate y-coordinate for centering an object on the screen
    public float centerY(float objHeight) {
        return (height - objHeight) / 2;
    }
}
```


package assignment3_000899156;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
/**
 * Implementation of drawing the wheels of the car
 * @author Jhayvee Arai, 000899156
 * June 13, 2023
 */
public class Wheel {
    /** x and y coordinates of wheel */
    private double x,y;
    public Wheel(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Drawing the wheels positioned from left
     * and right of the car.
     * @param gc graphics context to draw
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillOval(x,y,15,90);
    }
}

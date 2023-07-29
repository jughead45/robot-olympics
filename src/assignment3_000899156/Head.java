package assignment3_000899156;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
/**
 * Implementation of drawing the head and
 * neck of the Player
 * @author Jhayvee Arai, 000899156
 * June 13, 2023
 */
public class Head {
    /** x and y coordinates of head */
    private double x, y;
    public Head(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Drawing of Head and neck that set on the top of the
     * car of the player. Additional helmet or hat added on top
     * of head. Sets width and height to 40 of the head.
     * @param gc graphics context to draw
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.YELLOW);
        gc.fillOval(x+24,y-60,45,45);
        gc.fillRect(x+42, y-20, 10,20);
        gc.setFill(Color.BLACK);
        gc.fillArc(x+12, y - 60, 70, 50, 0, 180, ArcType.ROUND);

    }
}

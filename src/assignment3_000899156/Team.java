package assignment3_000899156;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
/**
 * Implementation of drawing Team with 3 players in it.
 * @author Jhayvee Arai, 000899156
 * June 13, 2023
 */
public class Team {
    /** x and y coordinates of Team */
    private double x, y;
    /** name of the team */
    private String name;
    /** color of the team */
    private Color color;
    /** Player class to set 3 players */
    Player p1, p2, p3;

    /**
     * calling for Player class to draw and set color
     * for 3 players
     * @param name name of the team
     * @param x x coordinates
     * @param y y coordinates
     * @param color color of the team
     */
    public Team(String name, double x, double y, Color color) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;

        p1 = new Player(x, y, color);
        p2 = new Player(x * 3, y, color);
        p3 = new Player(x * 5, y, color);
    }

    /**
     * Drawing the 3 Team that contains 3 Players on each
     * with team average tet below the team
     * @param gc graphics context to draw
     */
    public void draw(GraphicsContext gc) {
        double totalAve = (p1.getAverage() + p2.getAverage() + p3.getAverage()) / 3; //computation of the average of win percentage of the team
        gc.setFont(Font.font(20));
        p1.draw(gc);
        p2.draw(gc);
        p3.draw(gc);
        gc.setFill(Color.BLACK);
        gc.fillText(name + " (team average " + totalAve + ")", x, y + 130);
    }
}
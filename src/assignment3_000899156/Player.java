package assignment3_000899156;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Implementation of drawing Player, setting color,
 * setting average which is the win percentage.
 * @author Jhayvee Arai, 000899156
 * June 13, 2023
 */
public class Player {
    /** x and y coordinates of wheel */
    private double x, y;
    /** win percentage */
    private int average;
    /** title of a player, can be player or referee */
    private String title;
    /** color */
    private Color color;
    /** calling Wheel Class */
    Wheel wheel1, wheel2;
    /** calling Head Class */
    Head head;

    /**
     * Player Constructor that has default title
     * @param x x-coordinate of player/car
     * @param y y-coordinate of player/car
     * @param color color of the car
     */
    public Player(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        /**
         * randomize win percentage from 0 - 99
         * for each players
         */
        int min = 0;
        int max = 99;
        int range = (max - min) + 1;
        average = (int) (Math.random() * range) + min;
        title = "";  // setting empty title

        /**
         * create wheel and head setting its x and y coordinates
         */
        wheel1 = new Wheel(x-15,y);
        wheel2 = new Wheel(x+90,y);
        head = new Head(x,y);
    }

    /**
     * Player Constructor that can set title to any string
     * @param x x-coordinate of player/car
     * @param y y-coordinate of player/car
     * @param color color of the car
     * @param title title of the player
     */
    public Player(double x, double y, Color color, String title) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.title = title;
        average = 100;

        wheel1 = new Wheel(x-15,y);
        wheel2 = new Wheel(x+90,y);
        head = new Head(x,y);
    }

    /**
     *
     * @return return average/win percentage of the player
     */
    public int getAverage() {
        return average;
    }

    /**
     * Drawing the Player/car, head and 2 wheels from each side.
     * Setting up each average/win percantage and draw below the player.
     * @param gc graphics context to draw
     */
    public void draw(GraphicsContext gc) {
        if (title.equals("")) { // if choosing for player with default title
            gc.setFill(color);
            gc.fillRect(x, y, 90, 90);
            head.draw(gc);
            wheel1.draw(gc);
            wheel2.draw(gc);
            gc.setFill(Color.BLACK);
            gc.fillText(Integer.toString(average),x+40,y+45);
        } else { // if choosing for player to set referee with value of title
            gc.setFill(color);
            gc.fillRect(x, y, 90, 90);
            head.draw(gc);
            wheel1.draw(gc);
            wheel2.draw(gc);
            gc.setFill(Color.BLACK);
            gc.fillText(Integer.toString(average),x+30,y+45);
            gc.fillText(title,x,y+120);
        }
    }
}
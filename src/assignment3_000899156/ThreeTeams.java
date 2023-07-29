package assignment3_000899156;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * This is the main method that acts as a view and testing
 * for the Robot Olympics.
 * June 13, 2023
 *
 *
 * @author Jhayvee Arai, 000899156
 */
public class ThreeTeams extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(1000, 800); // Set canvas Size in Pixels
        stage.setTitle("Robot Olympics!"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE 

        // This is the part where 3 teams was created.
        Team t1 = new Team("Alpha", 100, 100, Color.ORANGE);
        t1.draw(gc);
        Team t2 = new Team("Bravo", 100, 350, Color.RED);
        t2.draw(gc);
        Team t3 = new Team("Charlie", 100, 600, Color.BLUE);
        t3.draw(gc);

        // Computation on getting random to be used for referee creation.
        int random = 0;
        int min = 1;
        int max = 3;
        int range = (max - min) + 1;
        random = (int) (Math.random() * range) + min;

        // Creation of referee
        if (random == 1) {
            Player ht1 = new Player(800,350,Color.ORANGE,"Referee Alpha");
            ht1.draw(gc);
        } else if(random == 2) {
            Player ht2 = new Player(800,350,Color.RED,"Referee Bravo");
            ht2.draw(gc);
        } else {
            Player ht3 = new Player(800,350,Color.BLUE,"Referee Charlie");
            ht3.draw(gc);
        }
        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}

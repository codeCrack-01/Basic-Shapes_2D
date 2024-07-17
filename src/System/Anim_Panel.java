package System;

import PrimitiveShapes.Circle;
import PrimitiveShapes.Rectangular;
import PrimitiveShapes.Square;
import PrimitiveShapes.Triangle;

import javax.swing.*;
import java.awt.*;

public class Anim_Panel extends JPanel implements Runnable {

    // PANEL SETTINGS ... //
    public static final int width = 800;
    public static final int height = 600;

    // ANIMATION LOOP ... //
    Thread appThread = new Thread();
    int FPS = 60;

    // PRIMITIVE SHAPES ... //
    Square square = new Square(50, Color.white, true);
    //Rectangular rect = new Rectangular(120, 60, 142, 424, Color.BLUE, false);
    //Circle circle = new Circle(100, 600, 120, Color.green, false);
    //Triangle triangle = new Triangle(100, 120, 100, Color.red, false);

    // -------------------- //

    public Anim_Panel ()
    {
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(new Color(14, 16, 20));
    }

    @Override
    public void run() {
        double drawInterval = ((double) (10 ^ 9) / FPS); // Interval in nano-seconds.
        double delta = 0;

        long lastTime = System.nanoTime();
        long currentTime;

        while (appThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta > 1) {
                update(); // Updates the game ...
                repaint(); // Re-draws the screen ...

                delta --;
            }

        }
    }

    /**  Update Method
     * <p>
    *   The Update Method is used by the thread loop for "updating" <br>
     *  the state of the system after a desired amount of time. We <br>
     *  check for any changes made to state of the system of our <br>
     *  software, game or application, etc.
     *  <p></p>
    *   <code>Zain Khan</code>
    */
    public void update() {
        // No need for now ...
    }

    /**  Repaint Method
     * <p>
     *   The Repaint Method is used by the thread loop for "re-drawing" <br>
     *  the system components after a desired amount of time. We just <br>
     *  check for any changes made to rendered components of our <br>
     *  software, game or application, etc.
     *  <p></p>
     *   <code>Zain Khan</code>
     */
    public void paintComponent (Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Set rendering hints for smoother lines
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Color of Graphics.
        g2.setColor(Color.white);

        // Draw the Shapes ...
        square.draw(g2);
        //triangle.draw(g2);

        //rect.draw(g2);
        //circle.draw(g2);

        g2.dispose();
    }
}

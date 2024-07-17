package PrimitiveShapes;

import System.*;
import java.awt.*;

public class Shape {
    public enum ShapeType {
        SQUARE, TRIANGLE, RECTANGLE, CIRCLE
    }

    protected ShapeType type;
    protected boolean isCentered;

    public int posX, posY;
    protected Color color;

    public Shape (Color color) {
        this.color  = color;
    }

    protected Point GetScreenSize () {
        int screenW = Anim_Panel.width;
        int screenH = Anim_Panel.height;

        return new Point(screenW, screenH);
    }
}

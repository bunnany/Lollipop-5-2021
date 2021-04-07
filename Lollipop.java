/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Class demonstration to draw a lollipop for our first GUI
 *
 * @author Ny
 * @version 1/04/21
 */
public class Lollipop {
    /* Fields */
    public static final double X = 300.0;       // horizontal center of lollipop
    public static final double Y = 180.0;       // vertical center of lollipop
    public static final double SIZE = 80.0;     // diameter of lollipop
    public static final double STICK = 200.0;   // length of the lollipop stick
    
    /**
     * Constructor for objects of class Lollipop 
     */
    public Lollipop() {
        UI.initialise();
        UI.addButton("Quit", UI::quit);         // Comment out to checkstyle
    }

    /**
     * Draw a red lollipop on a stick 
     *
     */
    private void drawLollipop(double x, double y, double size, double stick) {
        double left = x-size/2.0;
        double top = y-size/2.0;
        double bottom = y+stick;
        
        /* Drawing the stick */
        UI.setColor(Color.black);            // reset stick color
        UI.setLineWidth(size/8.0);           // set line width to 10
        UI.drawLine(x, y, x, bottom);    
        
        /* Drawing the lolly */
        UI.setLineWidth(1);                 // set line width to 1
        UI.setColor(Color.red);             // set color to red
        UI.fillOval(left, top, size, size);      // fill oval @(260, 160), 80x80
    }
    
    /**
     * Calls the drawLollipop method with a number of different parameters
     */
    public void doDrawLollipop() {
        /* ask user for diameter */
        double diam = UI.askDouble("Diameter: ");
        drawLollipop(300, 180, diam, 200);
        drawLollipop(50, 60, diam/2.0, 90);
        drawLollipop(400, 100, diam, 70);
    }
    
    /**
     * Main routine
     * 
     */
    public static void main(String[] args) {
        Lollipop obj = new Lollipop();
        obj.doDrawLollipop();                  // call the lollipop method
    }

}


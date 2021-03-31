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

    /**
     * Constructor for objects of class Lollipop 
     */
    public Lollipop() {
        UI.initialise();
        //UI.addButton("Quit", UI::quit);         // Comment out to checkstyle
    }

    /**
     * Draw a red lollipop on a stick 
     *
     */
    private void drawLollipop() {
        /* Drawing the stick */
        UI.setLineWidth(10);                // set line width to 10
        // draw a line (300, 200) to (300, 400)
        UI.drawLine(300, 200, 300, 400);    
        /* Drawing the lolly */
        UI.setLineWidth(1);                 // set line width to 1
        UI.setColor(Color.red);             // set color to red
        UI.fillOval(260, 160, 80, 80);      // fill oval @(260, 160), 80x80
    }
    
    /**
     * Main routine
     * 
     */
    public static void main(String[] args) {
        Lollipop obj = new Lollipop();
        obj.drawLollipop();                  // call the lollipop method
    }

}


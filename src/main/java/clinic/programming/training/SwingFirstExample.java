package clinic.programming.training;
import org.jdesktop.swingx.*;
public class SwingFirstExample {
    
    public static void main(String[] args) {    
        // Creating instance of JFrame
        JXFrame frame = new JXFrame("My First Swing Example");
        // Setting the width and height of frame
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JXFrame.EXIT_ON_CLOSE);

        /* Creating panel. This is same as a div tag in HTML
         * We can create several panels and add them to specific 
         * positions in a JFrame. Inside panels we can add text 
         * fields, buttons and other components.
         */
        JXPanel panel = new JXPanel();    
        // adding panel to frame
        frame.add(panel);
        /* calling user defined method for adding components
         * to the panel.
         */
        placeComponents(panel);

        // Setting the frame visibility to true
        frame.setVisible(true);
    }

    private static void placeComponents(JXPanel panel) {

        /* We will discuss about layouts in the later sections
         * of this tutorial. For now we are setting the layout 
         * to null
         */
        panel.setLayout(null);

        // Creating JLabel
        JXLabel userLabel = new JXLabel("HELLO MAVEN");
        /* This method specifies the location and size
         * of component. setBounds(x, y, width, height)
         * here (x,y) are cordinates from the top left 
         * corner and remaining two arguments are the width
         * and height of the component.
         */
        userLabel.setBounds(20,30,100,25);
        panel.add(userLabel);

        /* Creating text field where user is supposed to
         * enter user name.
         */
        

        // Same process for password label and text field.
        

        // Creating login button
        JXButton loginButton = new JXButton("IT WORKS");
        loginButton.setBounds(10, 80, 100, 25);
        panel.add(loginButton);
    }

}
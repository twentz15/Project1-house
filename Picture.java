/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square trunk;
    private Person person;
    private Triangle tree1;
    private Triangle tree2;
    private Triangle tree3;
    private Triangle hat;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        trunk = new Square();
        trunk.moveHorizontal(-110);
        trunk.moveVertical(80);
        trunk.changeSize(20);
        trunk.makeVisible();
        trunk.changeColor("black");
        
        person = new Person();
        person.changeColor("black");
        person.moveHorizontal(0);
        person.moveVertical(0);
        person.makeVisible();

        tree1 = new Triangle();
        tree1.changeColor("green");
        tree1.makeVisible();
        
        tree2 = new Triangle();
        tree2.changeColor("green");
        tree2.moveVertical(-30);
        tree2.makeVisible();
        
        tree3 = new Triangle();
        tree3.changeColor("green");
        tree3.moveVertical(-60);
        tree3.makeVisible();
        
        hat = new Triangle();
        hat.changeColor("red");
        hat.changeSize(19, 10);
        hat.moveHorizontal(70);
        hat.moveVertical(15);
        hat.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    /**public void setBlackAndWhite()
    {
        if (trunk != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }*/

    /**
     * Change this picture to use color display
     */
    /**public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }*/
}

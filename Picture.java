/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Matthew George
 * @version 9/20/15
 * 
 * Picture of a pyramid with obelisks, a person standing in front, and a black sun.
 */
public class Picture
{
    private Square ground;
    private Square lObelisk;
    private Triangle lObeliskTip;
    private Square rObelisk;
    private Triangle rObeliskTip;
    private Triangle pyramid;
    private Circle sun;
    private Person man;

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
        ground = new Square();
        ground.moveHorizontal(-310);
        ground.moveVertical(160);
        ground.changeSize(800, 200);
        ground.changeColor("yellow");
        ground.makeVisible();
        
        pyramid = new Triangle();
        pyramid.moveHorizontal(40);
        pyramid.moveVertical(-60);
        pyramid.changeSize(200, 300);
        pyramid.changeColor("yellow");
        pyramid.makeVisible();
        
        sun = new Circle();
        sun.moveHorizontal(-13);
        sun.moveVertical(-80);
        sun.changeSize(68);
        sun.changeColor("black");
        sun.makeVisible();
        
        man = new Person();
        man.moveHorizontal(20);
        man.moveVertical(60);
        man.changeColor("black");
        man.makeVisible();
        
        lObelisk = new Square();
        lObelisk.moveHorizontal(-225);
        lObelisk.moveVertical(10);
        lObelisk.changeSize(25, 150);
        lObelisk.changeColor("yellow");
        lObelisk.makeVisible();
        
        rObelisk = new Square();
        rObelisk.moveHorizontal(80);
        rObelisk.moveVertical(10);
        rObelisk.changeSize(25, 150);
        rObelisk.changeColor("yellow");
        rObelisk.makeVisible();
        
        lObeliskTip = new Triangle();
        lObeliskTip.moveHorizontal(-113);
        lObeliskTip.moveVertical(-34);
        lObeliskTip.changeSize(25, 25);
        lObeliskTip.changeColor("yellow");
        lObeliskTip.makeVisible();
        
        rObeliskTip = new Triangle();
        rObeliskTip.moveHorizontal(192);
        rObeliskTip.moveVertical(-34);
        rObeliskTip.changeSize(25, 25);
        rObeliskTip.changeColor("yellow");
        rObeliskTip.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (ground != null)   // only if it's painted already...
        {
            ground.changeColor("black");
            pyramid.changeColor("black");
            man.changeColor("white");
            lObelisk.changeColor("black");
            rObelisk.changeColor("black");
            lObeliskTip.changeColor("black");
            rObeliskTip.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (ground != null)   // only if it's painted already...
        {
            ground.changeColor("yellow");
            pyramid.changeColor("yellow");
            man.changeColor("black");
            lObelisk.changeColor("yellow");
            rObelisk.changeColor("yellow");
            lObeliskTip.changeColor("yellow");
            rObeliskTip.changeColor("yellow");
        }
    }
}

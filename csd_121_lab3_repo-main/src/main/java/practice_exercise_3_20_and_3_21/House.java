package practice_exercise_3_20_and_3_21;
import javax.sound.sampled.Line;
import java.awt.*;
import java.awt.geom.Line2D;

public class HouseDrawing {


    private int x, y, width, height;

    public House(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g)
    {
        Rectangle ext = new Rectangle(x,y,width,height);
        Rectangle window = new Rectangle(x + (width/6),y + (height/4),(width/4),(height/4));
        Rectangle door = new Rectangle(x + (width/2), y + (height/2),(width/6),(height/2));

        g.draw(ext);
        g.draw(window);
        g.draw(door);
        g.drawLine(x,y, x+(width/2),y - (height/2));
        g.drawLine(x+width,y, x+(width/2),y - (height/2));

    }





}

/*
 * Author: Jeremia
 * Date: 12/04/24
 * Description: creates the ball for the game brick break
 */
import java.awt.*;

public class Ball {
	
	//your code here!
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int radius;
	private int xVelocity;
	private int yVelocity;
	//constructor(s):
	public Ball(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xVelocity = 2; // Example initial velocity
		this.yVelocity = -2;
	}
	Color kirbyPink = new Color(223, 109, 169); 

	//methods:
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getXpos() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setXpos() {
		this.x = x;
	}
	public void setYpos() {
		this.y = y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getYpos() {
		return y;
	}
	public void setYpos(int y) {
		this.y = y;
	}
	public void setXVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}
	public void setYVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}
	public void reverseX() {
		xVelocity = -xVelocity;
	}
	
	public void reverseY() {
		yVelocity = -yVelocity;
	}	
	public int move(){
		this.x += this.xVelocity;
		this.y += this.yVelocity;
		return  0;
	}

	public void draw(Graphics g) {
			g.setColor(kirbyPink);
           g.fillOval(x, y, radius, radius);
	}
}

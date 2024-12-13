//
//  Class author:  Jeremia Pandiangan
//  Date created:  12/4/24
//  General description: Create a block the lets the ball get hit and go back to the bricks 
//


import java.awt.*;

public class Paddle {

	//your code here!
	//don't forget you need instance variables:
	private int width;
	private int height;
	private int x;
	private int y;
	private int xVelocity;
	private int yVelocity;
	private int Velocity;
	//constructor(s):
	public Paddle(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	//methods:
	Color myLavender = new Color(220, 172, 242); 

	//getters and setters:
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public int getVelocity(){
		return xVelocity;
	}
	public void setVelocity(int velocity) {
		this.xVelocity = velocity; 
	}
	public void setXVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}
	public void setYVelocity(int yVelocity) {
	}
	public void addVelocity(int amount) {
		this.xVelocity += amount;
	}
	public void move() {
		if (x < 1) {
			x = 10;  
			xVelocity = 0;
		} else if (x > 685 - width) {  
			x = 680 - width;
			xVelocity = 0;
		}
	
		x += xVelocity; 
		this.y = 550;
	}
	public void draw(Graphics g) {
		g.setColor(myLavender); 
		g.fillRect(x, y, width, height);
	}
}
	

package guimodule;

import processing.core.PApplet;

public class Display extends PApplet {
	
	public void setup() {
		size(400, 400);
		background(128,128,128);
	}
	
	public void draw() {
		fill(255,192,203);
		ellipse(200,200,300,280);
		fill(0,0,0);
		ellipse(150,200,50,100);
		ellipse(250,200,50,100);
	}

}

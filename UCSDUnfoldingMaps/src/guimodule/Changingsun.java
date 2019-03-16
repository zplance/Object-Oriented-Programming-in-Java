package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class Changingsun extends PApplet {
	PImage img;
	
	public void setup() {
		size(400, 400);
		background(255);
		stroke(0);			//set pen color
		img = loadImage("http://cseweb.ucsd.edu/~minnes/palmTrees.jpg", "jpg");
		img.resize(0, height);
		image(img, 0, 0);			//display
	}

	public void draw() {
		int[] color = suncolor(second());
		fill(color[0], color[1], color[2]);
		ellipse(width/4,height/5,width/4,height/5);
	}
	
	public int[] suncolor(float seconds) {
		int[] rgb = new int[3];
		float diff = Math.abs(30 - seconds);
		float ratio = diff/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		return rgb;
	}
}

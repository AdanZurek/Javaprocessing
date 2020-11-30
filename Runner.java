import processing.core.PApplet;

public class Runner extends PApplet {	
	
	public static void main(String[] args) {		
		PApplet.main("Runner");
	}
	 
	public void settings() {
		size(800, 800);
	}
		
	public void setup() {
		
		strokeWeight(3);
		
		String Console = "Enjoy my self-portrait";
		print(Console);
		
		background(135, 206, 235);
		fill(0, 0, 0); //3
		noStroke();
		ellipse(width/2, height/4, 200, 120); //hair
		
		fill(255, 219, 172);
		ellipse(555, 250, 75, 75); //right ear
		fill(255, 255, 255);
		ellipse(580, 250, 30, 30);
		rect(580 ,250, 5, 45);

		fill(255, 219, 172);
		ellipse(245, 250, 75, 75); //left ear
		fill(255, 255, 255);
		ellipse(220, 250, 30, 30);
		rect(220, 250, 5, 45);
		
		fill(255, 219, 172);
		rect(375, 360, 50, 135); //neck
		
		fill(0, 0, 0);
		ellipse(width/2, height/5, 375, 200); //hair 
		
		fill(255, 219, 172);
		ellipse(width/2, height/3, 350, 350 ); //head
		
		fill(0,0,0);
		rect(275, 90, 250, 25); //hairline 
		
		fill(255, 255, 255);
		ellipse(440, 200, 50, 50); //right eye
		
		fill(255, 255, 255);
		ellipse(360, 200, 50, 50);  //left eye
		
		fill(165, 42, 42);
		ellipse(440, 200, 25,  25); //right pupil
		fill(0,0,0);
		ellipse(440, 200, 10, 10);
		
		fill(165, 42, 42);
		ellipse(360, 200, 25, 25); //left pupil
		fill(0,0,0);
		ellipse(360, 200, 10, 10);
		
		fill(255, 0, 0);
		arc(400, 350, 80, 80, 0, PI, CHORD); //open mouth 
		
		fill(255, 255, 255);
		arc(400, 345, 80, 40, 0, PI, CHORD); //top teeth
	
		
		fill(255, 255, 255);
		arc(400, 380, 50, 20, 0, PI, CHORD); //bottom teeth
		
		fill(241, 194, 125);
		int trix = 340; //7
		int triy = 225;
		triangle(30+trix, 75+triy, 58+trix, 20+triy, 86+trix, 75+triy); //nose

		fill(0, 153, 51);
		rect(220, 480, 380, 350); //t-shirt
		fill(255, 219, 172);
		arc(400, 480, 100, 50, 0, PI, CHORD);
		
		fill(0, 153, 51);
		rect(145, 480, 75, 75); //left sleeve
		
		fill(0, 154, 51);
		rect(600, 480, 75, 75); //right sleeve
		
		fill(255, 219, 172);
		rect(145, 540, 75, 250); //left arm
		
		fill(255, 219, 172);
		rect(600, 540, 75, 250); //right arm
		fill(0, 0, 0);
		
		
		for (int k = 0; k<35; k+=5) {
			fill(0, 0, 0);
			ellipse(347+k, 190-25, 10, 10); //left eyebrow
			fill(0, 0, 0);
			ellipse(425+k, 190-25, 10, 10); //right eyebrow
		}
		
		for (int k= 0; k<5; k++) { //clouds
			fill(242, 242, 242);
			noStroke();
			ellipse(k*50+500, 0, 50, 50);
			ellipse(k*50+525, 15, 50, 50);
			ellipse(k*50+550, 25, 50, 50);
		}
		
		line(30, 20, 85, 75);
		fill(255, 255, 0);
		ellipse(0, 0, 200, 200); //sun
		fill(0, 0, 0);
		line(30, 20, 85, 75);
		line(30, 20, 85, 60);
		
		fill(255, 0, 0);
		quad(300 ,500, 250,600, 300, 600,  250, 500);
		
		}
	
	public void draw() {
		
	}
}

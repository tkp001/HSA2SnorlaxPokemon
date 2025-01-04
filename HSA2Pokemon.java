package graphics;
import java.awt.Color;
import hsa2.GraphicsConsole;
import java.awt.Font;
import java.awt.Polygon;
//import java.util.Random;
/* 
 * FirstDrawing.java
 * by Tanush P
 * December 11, 2024
 */

public class HSA2Pokemon {
	static int width = 430; // 1.5
	static int height = 600; // 1.5
	static GraphicsConsole gc = new GraphicsConsole(width,height); // 800 & 600 max

	//fonts
	Font StageF = new Font("Sans", Font.BOLD, 12);
	Font TitleF = new Font("Decotura", Font.PLAIN, 30);
	Font LevelF = new Font("Sans", Font.BOLD, 10);
	Font HpF = new Font("Decotura", Font.PLAIN, 25);
	Font AbilityF = new Font("Decotura", Font.PLAIN, 20);
	Font MoveF = new Font("Decotura", Font.PLAIN, 20);
	Font PictureDescF = new Font("Sans", Font.ITALIC, 12);
	Font BottomDescF = new Font("Comic Sans MS", Font.PLAIN, 13);
	Font MiniDescF = new Font("Comic Sans MS", Font.ITALIC, 8);
	Font MiniDescF2 = new Font("Comic Sans MS", Font.PLAIN, 9);
	Font RemarksF = new Font("Comic Sans MS", Font.PLAIN, 8);
	
	public static void main(String[] args) {
		new HSA2Pokemon();
	}
	
	HSA2Pokemon() {
		//Settings
		gc.setTitle("Snorlax Pokemon Card by Tanush P");
		gc.setAntiAlias(true);
		gc.setResizable(false);
		gc.setBackgroundColor(new Color(164, 161, 166));
		gc.clear();
		
		
		//Outer Border
		gc.setColor(new Color(255, 225, 101));
		gc.setStroke(35);
		gc.drawRoundRect (0, 0, width, height, 50, 50);
		
		//Stage
		Polygon diamond = new Polygon(); 
		diamond.addPoint(25, 25);
		diamond.addPoint(65, 13);
		diamond.addPoint(105, 25);
		diamond.addPoint(65, 37);
		gc.setColor(new Color(192, 151, 80));
		gc.setStroke(1);
		gc.fillPolygon(diamond);
		
		gc.setColor(Color.BLACK);
		gc.setFont(StageF);
		gc.drawString("BASIC", 49, 29);
		
		//Header

		gc.setFont(TitleF);
		gc.drawString("Snorlax", 40, 66);
				
		gc.setFont(LevelF);
		gc.drawString("LV.20", 233, 66);
				
		drawNormalType(365, 37, 32, 32);
				
		//Picture
			//Shadow
		gc.setColor(new Color(96, 86, 78));
		gc.setStroke(10);
		gc.drawRect(46, 83, 346, 240);
			
			//Background
//		gc.setColor(new Color(40, 147, 67));
		gc.setColor(new Color(0, 158, 158));
		gc.setStroke(1);
		gc.fillRect(43, 80, 346, 240);
			//Top Frame
		gc.setColor(new Color(195, 149, 67));
		gc.setStroke(6);
		gc.drawRect(43, 80, 346, 240);
			
		//SNORLAX
			//Base Shadow
		gc.setColor(Color.BLACK);
		gc.setStroke(1);
		gc.drawOval(92, 263, 247, 46);
		gc.setColor(new Color(0,0,0, 120));
		gc.fillOval(92, 263, 247, 46);
	
//		gc.fillRect(121, 105, 188, 188);
		gc.setColor(Color.BLACK);
		gc.setStroke(1);
		
		//Draw Function
		Polygon face = new Polygon();
		Polygon head = new Polygon();
		Polygon arm = new Polygon();
		
		Polygon leg = new Polygon();
	
		Polygon base = new Polygon();
		Polygon belly = new Polygon();
		
			//clawhand
			//clawleg
		
		int x = 119; //119
		int ref = 96*2;
		int div = 3;
		int y = 105; //105
		
		int[] facex = {96,90,73,66,63,65,69,81,96};
		int[] facey = {23,19,23,32,45,59,65,67,68};
		int[] headx = {97,83,66,63,61,61,58,57,61,69,96};
		int[] heady = {14,15,8 ,9 ,13,26,39,51,61,65,68};
		int[] armx = {61,43,28,13,4,3,5,17,29,69,70,96};
		int[] army = {61,66,75,88,104,110,115,114,109,78,111,80};
		int[] legx = {37,32,30,74,77,78,96};
		int[] legy = {158,164,177,177,172,166,149};
		int[] bellyx = {69,60,53,46,43,42,51,66,83,97};
		int[] bellyy = {65,75,84,96,110,125,141,155,159,160};
		int[] basex = {49,29,26,28,31,37,48,62,78,96};
		int[] basey = {73,109,121,140,151,158,164,166,166,168};
		
		int[] eyex = {89,81,74};
		int[] eyey = {30,30,32};
		int[] mouthx = {96,85,88,90};
		int[] mouthy = {41,41,36,41};
		int[] c1x = {5,4,2,2,4,7};
		int[] c1y = {111,110,113,116,115,110};
		
		int[] c2x = {28,34,38,28};
		int[] c2y = {171,166,171,171};
		
		for(int i = 0; i<facex.length; i++) {
			face.addPoint(x+facex[i], y+facey[i]);
		}
		for(int i = facex.length-1; i>-1; i--) {
			face.addPoint(x+ref-facex[i], y+facey[i]);
		}
		
		for(int i = 0; i<headx.length; i++) {
			head.addPoint(x+headx[i], y+heady[i]);
		}
		for(int i = headx.length-1; i>-1; i--) {
			head.addPoint(x+ref-headx[i], y+heady[i]);
		}
		
		for(int i = 0; i<armx.length; i++) {
			arm.addPoint(x+armx[i], y+army[i]);
		}
		for(int i = armx.length-1; i>-1; i--) {
			arm.addPoint(x+ref-armx[i], y+army[i]);
		}
		
		for(int i = 0; i<legx.length; i++) {
			leg.addPoint(x+legx[i], y+legy[i]);
		}
		for(int i = legx.length-1; i>-1; i--) {
			leg.addPoint(x+ref-legx[i], y+legy[i]);
		}
		
		for(int i = 0; i<bellyx.length; i++) {
			belly.addPoint(x+bellyx[i], y+bellyy[i]);
		}
		for(int i = bellyx.length-1; i>-1; i--) {
			belly.addPoint(x+ref-bellyx[i], y+bellyy[i]);
		}
		
		for(int i = 0; i<basex.length; i++) {
			base.addPoint(x+basex[i], y+basey[i]);
		}
		for(int i = basex.length-1; i>-1; i--) {
			base.addPoint(x+ref-basex[i], y+basey[i]);
		}
		
		
		gc.setStroke(1);
		gc.setColor(new Color(0,106,106));
		gc.fillPolygon(arm);
		gc.setColor(Color.BLACK);
		gc.drawPolygon(arm);
		
		gc.setColor(new Color(0,106,106));
		gc.fillPolygon(head);
		gc.setColor(Color.BLACK);
		gc.drawPolygon(head);
		
		gc.setColor(new Color(254,233,190));
		gc.fillPolygon(leg);
		gc.setColor(Color.BLACK);
		gc.drawPolygon(leg);
		
		gc.setColor(new Color(0,106,106));
		gc.fillPolygon(base);
		
			//base outline
		gc.setColor(Color.BLACK);
		for(int i = 0; i<basex.length-1; i++) {
			gc.drawLine(x+basex[i], y+basey[i], x+basex[i+1], y+basey[i+1]);
		}
		for(int i = basex.length-1; i>0; i--) {
			gc.drawLine(x+ref-basex[i-1], y+basey[i-1], x+ref-basex[i], y+basey[i]);
		}
		
		gc.setColor(new Color(254,233,190));
		gc.fillPolygon(belly);
		gc.setColor(Color.BLACK);
		gc.drawPolygon(belly);
		
		gc.setColor(new Color(254,233,190));
		gc.fillPolygon(face);
		gc.setColor(Color.BLACK);
		gc.drawPolygon(face);
		
			//eye
		for(int i = 0; i<eyex.length-1; i++) {
			gc.drawLine(x+eyex[i], y+eyey[i], x+eyex[i+1], y+eyey[i+1]);
		}
		for(int i = eyex.length-1; i>0; i--) {
			gc.drawLine(x+ref-eyex[i-1], y+eyey[i-1], x+ref-eyex[i], y+eyey[i]);
		}
			//mouth
		for(int i = 0; i<mouthx.length-1; i++) {
			gc.drawLine(x+mouthx[i], y+mouthy[i], x+mouthx[i+1], y+mouthy[i+1]);
		}
		for(int i = mouthx.length-1; i>0; i--) {
			gc.drawLine(x+ref-mouthx[i-1], y+mouthy[i-1], x+ref-mouthx[i], y+mouthy[i]);
		}
			//claw1
		
		int a = x;
		int b = y;
		for (int j = 0; j<3; j++) {	
			for(int i = 0; i<c1x.length-1; i++) {
				gc.drawLine(a+c1x[i], b+c1y[i], a+c1x[i+1], b+c1y[i+1]);
			}
			a += 3;
			b += 2;
		}
		
		a = x;
		b = y+3;
		for (int j = 0; j<3; j++) {
			for(int i = c1x.length-1; i>0; i--) {
			gc.drawLine(a+ref-c1x[i-1], b+c1y[i-1], a+ref-c1x[i], b+c1y[i]);
			}
		a -= 3;
		b -= 2;
			
		}
		
			//claw 2
		a = x;
		b = y+6;
		for (int j = 0; j<3; j++) {	
			for(int i = 0; i<c2x.length-1; i++) {
				gc.drawLine(a+c2x[i], b+c2y[i], a+c2x[i+1], b+c2y[i+1]);
			}
			a += 8;
			b += 0;
		}
		
		a = x;
		b = y+6;
		for (int j = 0; j<3; j++) {
			for(int i = c2x.length-1; i>0; i--) {
			gc.drawLine(a+ref-c2x[i-1], b+c2y[i-1], a+ref-c2x[i], b+c2y[i]);
			}
		a -= 10;
		b -= 0;
			
		}
		
		
		
		
		
		//Picture Description
		gc.setColor(Color.BLACK);
		gc.setStroke(1);
		gc.fillRect(278, 47, 3, 20);
		
		gc.setFont(HpF);
		gc.drawString("30 HP", 288, 66);
		
		gc.setColor(new Color(179, 148, 88));
		gc.setStroke(2);
		gc.fillRect(65, 333, 303, 17);
		
		gc.setColor(new Color(239, 206, 144));
		gc.setStroke(2);
		gc.drawRect(65, 333, 303, 17);
		
		gc.setColor(Color.BLACK);
		gc.setFont(PictureDescF);
		gc.drawString("NO. 143 Sleeping Pokemon HT: 6'11\" WT: 1014.1lbs", 70+2, 346);
		
		//Ability
		gc.setColor(new Color(191, 0, 0));

		gc.setFont(AbilityF);
		gc.drawString("Ability: Immunity", 40, 380);
		
		gc.setColor(Color.BLACK);
		gc.setFont(BottomDescF);
		gc.drawString("This Pokemon can't be affected by any Special Conditions.", 40, 400);
		gc.drawString("(Remove any Special Conditions affecting this Pokemon.)", 40, 415);
		
		gc.setStroke(1);
		gc.drawLine(40, 425, 390, 425);
		
		//Move or Attack
		for (int i = 0; i<4; i++) {
			drawNormalType(40 + (24*i), 435, 21, 21);	
		}

		gc.setColor(Color.BLACK);
		gc.setFont(MoveF);
		gc.drawString("Body Slam", 153, 453);
		
		gc.setFont(BottomDescF);
		gc.drawString("Flip a coin. If heads, your opponent's Active Pokemon is", 40, 473);
		gc.drawString("now Paralyzed.", 40, 488);
		
		gc.setFont(HpF);
		gc.drawString("50", 358, 453);
		
		//Bottom Header
		gc.setColor(Color.BLACK);
		gc.setStroke(2);
		gc.fillRect(35, 510, 188, 4);
		gc.fillRect(35, 563, 341, 4);
		
		gc.setStroke(1);
		gc.drawLine(35, 537, 223, 537);
	
			//Mini Description
		gc.setColor(new Color(195, 149, 67));
		gc.setStroke(2);
		gc.drawRect(230, 510, 153, 47);
		
		gc.setColor(Color.BLACK);
		gc.setFont(MiniDescF);
		gc.drawString("It is not satisfied unless it eats over", 235, 522);
		gc.drawString("880 pounds of food every day.", 235, 532);
		gc.drawString("When it is done eating, it goes", 235, 542);
		gc.drawString("promptly to sleep.", 235, 552);
				
		gc.setColor(Color.BLACK);
		gc.setFont(MiniDescF2);
		gc.drawString("weakness", 43, 528);
		drawFightType(87, 516, 18, 18);
		gc.setFont(MiniDescF2);
		gc.drawString("x", 108, 528);
		gc.setFont(BottomDescF);
		gc.drawString("2", 115, 530);
		gc.setFont(MiniDescF2);
		gc.drawString("resistance", 130, 528);
		
			//Next Column
		gc.drawString("retreat", 46, 548);
		gc.drawString("cost", 52, 558);
		
		for (int i = 0; i<4; i++) {
			drawNormalType(87 + (22*i), 541, 18, 18);
		}
		
		//Bottom Remarks
		gc.setFont(RemarksF);
		gc.drawString("lllus. Tanush Pandya", 26, 578);
		gc.drawString("@2024 LCSS", 185, 578);
		gc.drawString("XY179", 350, 578);
	}
	
	static void drawNormalType(int x, int y, int l, int w) {
		Polygon t1 = new Polygon(); 
		
		gc.setColor(Color.WHITE);
		gc.setStroke(1);
		gc.fillOval(x, y, w, l);		
		t1.addPoint(x+(w/2), y+(l/12));
		t1.addPoint(x+(2*w/5), y+(l/3));		
		t1.addPoint(x+(w/8), y+(l/4));
		t1.addPoint(x+(w/3), y+(l/2));
		
		t1.addPoint(x+(w/8), y+(3*l/4));		
		t1.addPoint(x+(2*w/5), y+(2*l/3));
		t1.addPoint(x+(w/2), y+(11*l/12));
		t1.addPoint(x+(3*w/5), y+(2*l/3));
		
		t1.addPoint(x+(7*w/8), y+(3*l/4));
		t1.addPoint(x+(2*w/3), y+(l/2));
		t1.addPoint(x+(7*w/8), y+(l/4));
		t1.addPoint(x+(3*w/5), y+(l/3));
		
		gc.setColor(Color.BLACK);
		gc.fillPolygon(t1);
	}
	
	static void drawFightType(int x, int y, int l, int w) { 	
		gc.setColor(new Color(239, 95, 57));
		gc.setStroke(1);
		gc.fillOval(x, y, w, l);
		
		gc.setColor(Color.BLACK);
		gc.fillRect(x+(2*w/15), y+(4*l/15), 2*l/15, 4*w/15);
		gc.fillRect(x+(5*w/15), y+(3*l/15), 2*l/15, 5*w/15);
		gc.fillRect(x+(8*w/15), y+(3*l/15), 2*l/15, 5*w/15);
		gc.fillRect(x+(11*w/15), y+(4*l/15), 2*l/15, 4*w/15);
		
		gc.fillRect(x+(2*w/15), y+(9*w/15), 4*l/15, 3*w/15);
		gc.fillRect(x+(7*w/15), y+(9*w/15), 6*l/15, 3*w/15);
		gc.fillRect(x+(5*w/15), y+(11*w/15), 6*l/15, 2*w/15);
		gc.fillRect(x+(6*w/15), y+(13*w/15), 4*l/15, 1*w/15);
	}
}

package week2;

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {
	private static final int HEAD_WIDTH = 80;
	private static final int HEAD_HEIGHT = 120;
	private static final int EYE_RADIUS = 2;
	private static final int MOUTH_WIDTH = 18;
	private static final int MOUTH_HEIGHT = 4;
/*	private static final int NOSE_WIDTH = 4;
	private static final int NOSE_HEIGHT = 24;
	private static final int EYEBROW_WIDTH = 12;
	private static final int EYEBROW_HEIGHT = 4;
*/	
	public void run() {
		createFace(getWidth() / 2, getHeight() / 2);
	}
	
	public void createFace(double x, double y) {
		robotHead(x , y);
		robotHeadOutline(x , y);
		robotEye(x - HEAD_WIDTH / 4, y - HEAD_HEIGHT / 4);
		robotEye(x + HEAD_WIDTH / 4, y - HEAD_HEIGHT / 4);
		robotMouth (x , y + HEAD_HEIGHT / 4);
/*		robotNose(x,y);
		robotEyebrow(x - HEAD_WIDTH / 4, y - HEAD_HEIGHT / 3);
		robotEyebrow(x + HEAD_WIDTH / 4, y - HEAD_HEIGHT / 3);
*/	}
	
	public void robotHead(double x, double y) {
		double x2 = x - HEAD_WIDTH / 2;
		double y2 = y - HEAD_HEIGHT / 2;
		GRect head = new GRect(x2,y2, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
	}
	
	 public void robotHeadOutline(double x, double y) {
		double x2 = x - HEAD_WIDTH / 2;
		double y2 = y - HEAD_HEIGHT / 2;
		GRect head = new GRect(x2,y2, HEAD_WIDTH, HEAD_HEIGHT);
/*		head.setFilled(fasle); */
		head.setColor(Color.BLACK);
		add(head);
	}
	
	public void robotEye(double x, double y) {
		   double x2 = x - EYE_RADIUS;
		   double y2 = y - EYE_RADIUS;
		   GOval eye = new GOval(x2, y2, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		   eye.setFilled(true);
		   eye.setColor(Color.YELLOW);
		   add(eye);
		}
				
	public void robotMouth(double x, double y) {
		double x2 = x - MOUTH_WIDTH / 2;
		double y2 = y - MOUTH_HEIGHT / 2;
		GRect mouth = new GRect(x2, y2, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(Color.WHITE);
		add(mouth);
		}
	
/*	public void robotNose(double x, double y) {
		double x2 = x - NOSE_WIDTH / 2;
		double y2 = y - NOSE_HEIGHT / 2;
		GRect nose = new GRect(x2, y2, NOSE_WIDTH, NOSE_HEIGHT);
		nose.setFilled(true);
		nose.setColor(Color.WHITE);
		add(nose);
		}
	
	public void robotEyebrow(double x, double y) {
		double x2 = x - EYEBROW_WIDTH / 2;
		double y2 = y - EYEBROW_HEIGHT / 2;
		GRect eyebrow = new GRect(x2, y2, EYEBROW_WIDTH, EYEBROW_HEIGHT);
		eyebrow.setFilled(true);
		eyebrow.setColor(Color.BLACK);
		add(eyebrow);
		}
*/}
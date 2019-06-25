package main;

import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;

public class DigitalClock extends Applet implements Runnable{

	private static final long serialVersionUID = 1L;
	
	Thread t = null;
	int hours = 0, minutes = 0, seconds = 0;
	String timeString = "";
	
	public void init() {
		setBackground(new Color(255, 240, 230));
	}
	
	public void start() {
		Thread t = new Thread(this);
		t.start();
	}
	
	@SuppressWarnings("static-access")
	public void run() {
		try {
			while(true) {
				Calendar cal = Calendar.getInstance();
				hours = cal.get(Calendar.HOUR_OF_DAY);
				if (hours > 12) {
					hours -= 12;
				}
				minutes = cal.get(Calendar.MINUTE);
				seconds = cal.get(Calendar.SECOND);
				
				SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
				Date date = cal.getTime();
				timeString = formatter.format(date);
				repaint();
				t.sleep(1000); //milliseconds
			}
		}catch(Exception e) {
			
		}
	}
	
	public void paint(Graphics g) {
		Font fi = new Font("TimesRoman", Font.ITALIC, 18);
		
		this.setSize(200, 150);
		g.setColor(Color.blue);
		g.setFont(fi);
		g.drawString(timeString, 65, 75);
	}
}

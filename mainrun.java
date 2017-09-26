package test;
import java.awt.*;

public class mainrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x,xpos,ypos,blocksize,count2,c,evencount; int offset, xposo;
		DrawingPanel panel = new DrawingPanel(650, 400);
		Graphics g = panel.getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 650, 400);
		towerdown(g, 0, 0, 20, 0, 4, 1);
		towerdown(g, 50, 70, 30, 0, 5, 1);
		towerdown(g, 10, 150, 25, 0, 4, 8);
		towerdown(g,250, 200, 25, 10,3,6 );
		towerdown(g, 425, 180, 20, 10, 5, 10);
		towerdown(g, 400, 20, 35, 35, 2, 4);
	}//end of main

	private static void towerdown(Graphics g,int xp, int yp, int bloc, int offset,int xro, int yro ) {
		int count2,x,evencount=0; 
		int xpof=xp;
		//xp=425;ypos=180;blocksize=20;evencount=0;offset=10;
		for (count2=0;count2<yro;count2++) {
			if (evencount==0) {
				xp=xpof;
			}
			else if(evencount==1) {
				xp=xpof+offset;
			}
			for (x=0;x<xro;x++) {
				g.setColor(Color.BLACK);
				g.fillRect(xp, yp, bloc, bloc);
				g.setColor(Color.blue);
				int twig = xp+bloc;
				int twig2 = yp+bloc;
				g.drawLine(xp, yp, twig, twig2);
				g.drawLine(xp, twig2, twig, yp);
				g.setColor(Color.WHITE); xp+=bloc;
				g.fillRect(xp, yp, bloc, bloc);
				xp+=bloc;
				
				
				
			
			}
			yp+=bloc;
			if (evencount==0) {
				xp=xpof;
				evencount++;
			}
			else if(evencount==1) {
				xp=xpof+offset;
				evencount=0;
			}
			yp=yp+2;
			xp = xpof;
			
		}
	}
}

package igu.ventanas;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JFrame;

//import igu.laminas.Lamina;

public class Ventana extends JFrame{
//	private ArrayList<Lamina> laminas;
	
	public Ventana(double cX, double cY) {
		this.setLocation((int)cX, (int)cY);
//		laminas=new ArrayList<Lamina>();
	}
	
	public Ventana(Point2D.Double pc) {
		this.setLocation((int)pc.getX(),(int)pc.getY());
//		laminas=new ArrayList<Lamina>();
	}
	
	public Ventana(double cX, double cY, int ancho, int alto) {
		this(cX,cY);
		int x=this.getX();
		int y=this.getY();
		this.setBounds(x, y, ancho, alto);
	}
	
	public Ventana(Point2D.Double pc, int ancho, int alto) {
		this(pc);
		int x=this.getX();
		int y=this.getY();
		this.setBounds(x, y, ancho, alto);
	}
	
	public Ventana(String titulo, double cX, double cY) {
		this(cX,cY);
		this.setTitle(titulo);
	}
	
	public Ventana(String titulo, Point2D.Double pc) {
		this(pc);
		this.setTitle(titulo);
	}
	
	public Ventana(String titulo, double cX, double cY, int ancho, int alto) {
		this(cX,cY,ancho,alto);
		this.setTitle(titulo);
	}
	
	public Ventana(String titulo, Point.Double pc, int ancho, int alto) {
		this(pc,ancho,alto);
		this.setTitle(titulo);
	}
	
	public Ventana(int ancho, int alto) {
		this.setSize(ancho,alto);
//		laminas=new ArrayList<Lamina>();
	}
	
	public Ventana(String titulo, int ancho, int alto) {
		this.setTitle(titulo);
		this.setSize(new Dimension(ancho, alto));
//		laminas=new ArrayList<Lamina>();
	}
	
	public Ventana() {
		this.centrar();
//		laminas=new ArrayList<Lamina>();
	}
	
	public Ventana(String titulo) {
		this();
		this.setTitle(titulo);
	}
	
//	public void agregarLamina(Lamina lamina) {
//		laminas.add(lamina);
//	}
	
	public void visibilizar() {
		this.setVisible(true);
	}
	
	public void ocultar() {
		this.setVisible(false);
	}
	
	public void redimensionable(boolean b) {
		this.setResizable(b);
	}
	
	public void tamanoAlAbrir(int tamano) {
		/* Tamano puede ser:
		 * 					JFrame.MAXIMIZED_BOTH
		 * 					JFrame.MAXIMIZED_HORIZ	
		 * 					JFrame.MAXIMIZED_VERT
		 * 					etc.
		 */
		this.setExtendedState(tamano);
	}
	
	public void centrar() {
		Toolkit configuracion=Toolkit.getDefaultToolkit();
		Dimension tamano=configuracion.getScreenSize();
		int x=tamano.width/4;
		int y=tamano.height/4;
		int ancho=tamano.width/2;
		int alto=tamano.height/2;
		this.setBounds(x, y, ancho, alto);
	}
	public void alCerrar(int accion) {
		/*	Accion puede ser:
		 * 					 JFrame.EXIT_ON_CLOSE
		 * 					 JFrame.DISPOSE_ON_CLOSE				
		 * */
		this.setDefaultCloseOperation(accion);
	}
}
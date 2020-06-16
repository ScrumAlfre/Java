package igu.prueba;

import javax.swing.JFrame;

import igu.ventanas.Ventana;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana ventana=new Ventana();
		ventana=new Ventana("¡Bienvenidos!");
		
		ventana.redimensionable(false);
		ventana.alCerrar(JFrame.EXIT_ON_CLOSE);
		ventana.visibilizar();
	}

}

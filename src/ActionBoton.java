import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que implementa el listener de los botones del Buscaminas.
 * De alguna manera tendrá que poder acceder a la ventana principal.
 * Se puede lograr pasando en el constructor la referencia a la ventana.
 * Recuerda que desde la ventana, se puede acceder a la variable de tipo ControlJuego
 * @author Ana María Nieto
 * @version 1.1
 * @since 1.1
 */
public class ActionBoton implements ActionListener{

	private final static int MINA = -1;
	private VentanaPrincipal ventana;
	private int v;
	private int h;

	public ActionBoton(VentanaPrincipal ventana, int v, int h) {
		
		this.ventana = ventana;
		this.v = v;
		this.h = h;

	}
	
	/**
	 *Acción que ocurrirá cuando pulsamos uno de los botones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(ventana.getJuego().tablero[v][h]== MINA){
			ventana.mostrarFinJuego(true);
		}else if(ventana.getJuego().esFinJuego()){
			ventana.mostrarFinJuego(false);
		}else{
			ventana.actualizarPuntuacion();
			ventana.mostrarNumMinasAlrededor(v, h);
		}
	}

}

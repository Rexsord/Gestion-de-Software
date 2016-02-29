package datos;
import javax.swing.*;
import java.awt.*;

public class nuevoContacto extends JFrame{

	public nuevoContacto() {
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = pantalla.getScreenSize();
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		
		setBounds(anchoPantalla/4, alturaPantalla/4,anchoPantalla/2, alturaPantalla/2);
		setVisible(true);
		setTitle("Agregar Nuevo Contacto");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}

}

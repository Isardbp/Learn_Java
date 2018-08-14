import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
public class Ventana extends JFrame{
	public Ventana(){
		this.setSize(500,500); //Establecemos la ventana
		//setLocation(100, 200); //Establecemos la posicion de la ventana
		setLocationRelativeTo(null); //Establecemos la ventana en el cento
		//setBounds(100, 200, 500, 500); //Es como setSize y setLocation junts
		//setResizable(false); //Establecemos si la ventana puede cambiar de tamaño o no
		//this.getContentPane().setBackground(Color.BLUE); //Establecemos color
		setMinimumSize(new Dimension(200,200)); //Establecemos el tamao minimo
		setTitle("Red Panda"); //Establecemos el nombe
		
		iniciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void iniciarComponentes(){
		JPanel panel = new JPanel(); //Creacion de un panel
		panel.setLayout(null); //Desactivar el Diseño por defecto del panel
		//panel.setBackground(Color.GREEN); //Establecemos el color del panel
		this.getContentPane().add(panel); //Agregamos el panel a la ventana
		
		//JLabel etiqueta = new JLabel("Hola",SwingConstants.CENTER); //Creamos una etiqueta y le asignamos la posicion del centro
		JLabel etiqueta = new JLabel();
		etiqueta.setText("Mundial 2018"); //Establecemos el texto de la etiqueta
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Establecemos la alineacion orizontal del texto de la etiqueta
		//etiqueta.setOpaque(true); //Permiso para pintar la etiqueta
		etiqueta.setBounds(85,10,300,80); 
		etiqueta.setForeground(Color.BLUE); //Color lletra
		//etiqueta.setBackground(Color.RED); //Color fondo etiqueta
		etiqueta.setFont(new Font("cooper black", 0, 40)); //Establecemos la fuente del texto
		panel.add(etiqueta); //Agregamos la etiqueta al panel
		
		ImageIcon imagen = new ImageIcon("balon.jpg");
		JLabel etiqueta2 = new JLabel(); 
		etiqueta2.setBounds(90,80,300,300);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
		panel.add(etiqueta2);
	}
}

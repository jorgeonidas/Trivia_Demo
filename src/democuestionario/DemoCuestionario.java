/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democuestionario;
import democuestionario.CuestionarioForm;
import java.awt.Dimension;
import javax.swing.JFrame;
/**
 *
 * @author Jorge
 */
public class DemoCuestionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuestionarioForm ventana = new CuestionarioForm();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize( 350, 400); // set frame size
        ventana.setMinimumSize(new Dimension(350,400));
        ventana.setVisible( true ); // display frame
    }
    
}

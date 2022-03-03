package calculadoramvc;

import calculadoramvc.controlador.CalculadoraControlador;
import calculadoramvc.modelo.CalculadoraModelo;
import calculadoramvc.vista.CalculadoraVista;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CalculadoraMVC {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        CalculadoraModelo modelo = new CalculadoraModelo();
        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraControlador controlador = new CalculadoraControlador(vista, modelo);

        vista.setVisible(true);
    }

}

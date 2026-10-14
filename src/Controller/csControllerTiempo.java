package Controller;

import Model.csConversionTiempo;
import View.JFrmTiempo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class csControllerTiempo implements ActionListener {
    private JFrmTiempo view;

    // Solo recibo la vista porque mi modelo se va a instanciar hasta que se presione el boton
    public csControllerTiempo(JFrmTiempo view) {
        this.view = view;
        // Asigno el evento clic al boton de mi vista
        this.view.jBtnConvertir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtengo el valor ingresado en la interfaz
        int cantidad = Integer.parseInt(view.jTextCantidad.getText());
        
        // Asigno el multiplicador a segundos dependiendo del radio seleccionado, sin usar bloques if
        int factor = view.jRadioSegundos.isSelected() ? 1 : 
                    (view.jRadioMinutos.isSelected() ? 60 : 3600);

        // Instancio mi modelo enviando la cantidad y el factor (cumpliendo con el requerimiento del constructor)
        csConversionTiempo model = new csConversionTiempo(cantidad, factor);

        // Muestro los resultados obtenidos directamente de mi modelo
        view.jTextSegundos.setText(String.valueOf(model.getSegundos()));
        view.jTextMinutos.setText(String.valueOf(model.getMinutos()));
        view.jTextHoras.setText(String.valueOf(model.getHoras()));
    }
}
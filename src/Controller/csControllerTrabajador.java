package Controller;

import Model.csTrabajador;
import View.JFrmTrabajador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class csControllerTrabajador implements ActionListener {
    
    private JFrmTrabajador view;

    public csControllerTrabajador(JFrmTrabajador view) {
        this.view = view;
        // Asigno el evento clic a mi botón Calcular
        this.view.jBtnCalcular.addActionListener(this);
        // También asigno el evento a mis casillas para poder validarlas cuando se marquen
        this.view.jCheckDiurna.addActionListener(this);
        this.view.jCheckVespertina.addActionListener(this);
        this.view.jCheckNocturna.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Valido si el usuario hizo clic en la Jornada Diurna
        if (e.getSource() == view.jCheckDiurna) {
            boolean seleccionado = view.jCheckDiurna.isSelected();
            view.jCheckVespertina.setEnabled(!seleccionado);
            view.jCheckNocturna.setEnabled(!seleccionado);
        }
        // Valido si el usuario hizo clic en la Jornada Vespertina
        else if (e.getSource() == view.jCheckVespertina) {
            boolean seleccionado = view.jCheckVespertina.isSelected();
            view.jCheckDiurna.setEnabled(!seleccionado);
            view.jCheckNocturna.setEnabled(!seleccionado);
        }
        // Valido si el usuario hizo clic en la Jornada Nocturna
        else if (e.getSource() == view.jCheckNocturna) {
            boolean seleccionado = view.jCheckNocturna.isSelected();
            view.jCheckDiurna.setEnabled(!seleccionado);
            view.jCheckVespertina.setEnabled(!seleccionado);
        }
        // Valido si el usuario hizo clic en Calcular
        else if (e.getSource() == view.jBtnCalcular) {
            // Obtengo los datos ingresados
            int dias = Integer.parseInt(view.jTextDias.getText());
            double pago = Double.parseDouble(view.jTextPago.getText());
            
            // Asigno las horas diarias usando ternarios según la casilla seleccionada
            int horas = view.jCheckDiurna.isSelected() ? 8 : 
                       (view.jCheckVespertina.isSelected() ? 6 : 
                       (view.jCheckNocturna.isSelected() ? 5 : 0));
            
            // Instancio mi modelo enviándole los valores limpios
            csTrabajador model = new csTrabajador(dias, pago, horas);
            
            // Muestro el resultado en la vista
            view.jTextTotal.setText(String.valueOf(model.calcularPago()));
        }
    }
}
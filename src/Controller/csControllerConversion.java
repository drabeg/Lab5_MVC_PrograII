package Controller;

import Model.csConversion;
import View.JFrmConversion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class csControllerConversion implements ActionListener {
    private csConversion model;
    private JFrmConversion view;

    public csControllerConversion(csConversion model, JFrmConversion view) {
        this.model = model;
        this.view = view;
        // Se le asigna la escucha del clic al botón de la vista
        this.view.jBtnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 1. Obtener el número escrito en la vista
        double valor = Double.parseDouble(view.jTextValor.getText());
        
        // 2. Mandar el valor al modelo
        model.setValor(valor);
        
        // 3. Revisar qué radio button está seleccionado y mandarlo al modelo
        if (view.jRadioCtoF.isSelected()) {
            model.setAFahrenheit(true);
        } else if (view.jRadioFtoC.isSelected()) {
            model.setAFahrenheit(false);
        }
        
        // 4. Pedirle el cálculo al modelo y mostrarlo en la vista
        view.jTextResultado.setText(String.valueOf(model.calcular()));
    }
}
package Controller;

import Model.csPositivo;
import View.JFrmPositivo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class csControllerPositivo implements ActionListener {
    
    private csPositivo model;
    private JFrmPositivo view;
    
    public csControllerPositivo(csPositivo model, JFrmPositivo view) {
        this.model = model;
        this.view = view;
        // Aquí el controlador se pone a "escuchar" el clic del botón
        this.view.jBtnCalcular.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // 1. Sacar el dato de la vista
        int numero = Integer.parseInt(view.jTextNumero.getText());
        
        // 2. Pasarlo al modelo
        model.setNumero(numero);
        
        // 3. Pedir el resultado al modelo y mandarlo a la vista
        view.jTextResultado.setText(model.resultado());
    }
}
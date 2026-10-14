package Controller;

import Model.csInteres;
import View.JFrmInteres;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class csControllerInteres implements ActionListener {
    private csInteres model;
    private JFrmInteres view;

    public csControllerInteres(csInteres model, JFrmInteres view) {
        this.model = model;
        this.view = view;
        // Suscribimos el botón al evento clic
        this.view.jBtnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 1. Sacamos los datos de la vista (C0, i, n)
        double c0 = Double.parseDouble(view.jTextC0.getText());
        double i = Double.parseDouble(view.jTextI.getText());
        int n = Integer.parseInt(view.jTextN.getText());
        
        // 2. Pasamos los datos al modelo
        model.setValores(c0, i, n);
        
        // 3. Pedimos el cálculo al modelo y lo mostramos en la vista
        view.jTextResultado.setText(String.valueOf(model.calcularCn()));
    }
}
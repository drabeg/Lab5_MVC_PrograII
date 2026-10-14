package Controller;

import Model.csModa;
import View.JFrmModa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class csControllerModa implements ActionListener {
    private csModa model;
    private JFrmModa view;

    public csControllerModa(csModa model, JFrmModa view) {
        this.model = model;
        this.view = view;
        this.view.jBtnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Sacamos los 5 números de la vista
        int n1 = Integer.parseInt(view.jTextN1.getText());
        int n2 = Integer.parseInt(view.jTextN2.getText());
        int n3 = Integer.parseInt(view.jTextN3.getText());
        int n4 = Integer.parseInt(view.jTextN4.getText());
        int n5 = Integer.parseInt(view.jTextN5.getText());
        
        // Se los mandamos al modelo
        model.setNumeros(n1, n2, n3, n4, n5);
        
        // Pedimos la moda y la mostramos
        view.jTextResultado.setText("Moda: " + model.calcularModa());
    }
}
package Controller;

import Model.csIntermedio;
import View.JFrmIntermedio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class csControllerIntermedio implements ActionListener {
    private csIntermedio model;
    private JFrmIntermedio view;

    public csControllerIntermedio(csIntermedio model, JFrmIntermedio view) {
        this.model = model;
        this.view = view;
        this.view.jBtnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 1. Sacamos los 3 números de la vista
        int n1 = Integer.parseInt(view.jTextNumero1.getText());
        int n2 = Integer.parseInt(view.jTextNumero2.getText());
        int n3 = Integer.parseInt(view.jTextNumero3.getText());
        
        // 2. Se los mandamos al modelo
        model.setNumeros(n1, n2, n3);
        
        // 3. Pedimos los resultados al modelo y los mostramos en su respectivo JTextField
        view.jTextMenor.setText(String.valueOf(model.getMenor()));
        view.jTextIntermedio.setText(String.valueOf(model.getIntermedio()));
        view.jTextMayor.setText(String.valueOf(model.getMayor()));
    }
}
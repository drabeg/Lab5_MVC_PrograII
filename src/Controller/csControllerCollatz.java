package Controller;

import Model.csCollatz;
import View.JFrmCollatz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class csControllerCollatz implements ActionListener {
    private csCollatz model;
    private JFrmCollatz view;

    public csControllerCollatz(csCollatz model, JFrmCollatz view) {
        this.model = model;
        this.view = view;
        this.view.jBtnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int numero = Integer.parseInt(view.jTextNumero.getText());
        model.setNumero(numero);
        view.jTextResultado.setText(model.calcularSerie());
    }
}
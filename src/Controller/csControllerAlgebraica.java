package Controller;

import Model.csAlgebraica;
import View.JFrmAlgebraica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class csControllerAlgebraica implements ActionListener {
    
    private JFrmAlgebraica view;

    // Solo recibo la vista para instanciar mi modelo en el momento del clic
    public csControllerAlgebraica(JFrmAlgebraica view) {
        this.view = view;
        // Asigno el evento clic a mi botón Calcular
        this.view.jBtnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtengo los valores de las constantes ingresadas en mi interfaz
        double a = Double.parseDouble(view.jTextA.getText());
        double x = Double.parseDouble(view.jTextX.getText());
        double b = Double.parseDouble(view.jTextB.getText());
        double c = Double.parseDouble(view.jTextC.getText());
        
        // Instancio mi modelo mandándole los valores al constructor
        csAlgebraica model = new csAlgebraica(a, x, b, c);
        
        // Muestro el resultado del cálculo en mi vista
        view.jTextResultado.setText(String.valueOf(model.calcular()));
    }
}
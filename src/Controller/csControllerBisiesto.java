package Controller;

import Model.csBisiesto;
import View.JFrmBisiesto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class csControllerBisiesto implements ActionListener {
    
    private JFrmBisiesto view;

    // Solo recibo la vista en mi constructor
    public csControllerBisiesto(JFrmBisiesto view) {
        this.view = view;
        // Le asigno la escucha del clic a mi botón
        this.view.jBtnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtengo el año ingresado en mi interfaz
        int anio = Integer.parseInt(view.jTextAnio.getText());
        
        // Instancio mi modelo enviándole el año
        csBisiesto model = new csBisiesto(anio);
        
        // Uso un operador ternario para definir el mensaje dependiendo de la respuesta de mi modelo
        String resultado = model.evaluarBisiesto() ? "Es un año bisiesto" : "No es un año bisiesto";
        
        // Muestro el resultado en mi vista
        view.jTextResultado.setText(resultado);
    }
}
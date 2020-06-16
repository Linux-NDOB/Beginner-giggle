//para hacer el ejemplo mas entendible se hizo uso del paquete Swing de java
// el cual contiene componentes graficos com el que se hara uso a continuacion
//llamado JOptionPane

import javax.swing.*;

public class Code {
    // Para la realizacion del ejercico se declararan
    // 2 varibales de tipo float o decimal una para
    // cantidad de acres a convertir y otra para
    // cantidad de hectareas resultantes en m²
    private float Acres;
    private float Hectares;

    // Se genera el metodo constructor igualando las variables
    // a cero
    public Code() {
        Acres = 0;
        Hectares = 0;
    }

    //Se generan los metodos set y get que pueden ser autogenerados
    // por el IDE(Entorno de Desarrollo Integrado) en la opcion de
    // generar codigo/Constructor || setter and getter al dar click
    //derecho sobre la pantalla
    public float getAcres() {
        return Acres;
    }

    public void setAcres(float acres) {
        Acres = acres;
    }

    public float getHectares() {
        return Hectares;
    }

    public void setHectares(float hectares) {
        Hectares = hectares;
    }

    // Se crea el metodo de tipo void en el cual
    // se nos pedira la cantidad de acres a convertir
    // y se mostrara un mensaje en pantalla con la cantidad
    // de hectareas equivalentes
    public void Conversions(){

        //El valor actual de la hectarea es de 2.4711m^2
        // cerciorarse con anterioridad del valor de la hectarea
        Hectares = (float)2.4711;

        //Se muestra un mensaje en patalla pidiendo la cantidad de acres a convertir
        Acres = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number \n"+
                                                             "of hectares in acres to convert"));
        //se divide la cantidad de acres entre el valor de la hectarea
       float ConvertAcresToHectares = (Acres/Hectares);

       // Se muestra en pantalla la cantidad de acres introducida y su valor en hectareas
       JOptionPane.showMessageDialog(null,Acres+"hac = "+ ConvertAcresToHectares +"m²");
    }

}


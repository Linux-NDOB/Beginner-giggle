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
    // generar codigo/Constructor || setter and getter
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

        Hectares = (float)2.4711;
        Acres = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number \n"+
                                                             "of hectares in acres to convert"));

       float ConvertAcresToHectares = (Acres/Hectares);

       JOptionPane.showMessageDialog(null,Acres+"hac = "+ ConvertAcresToHectares +"m²");
    }

}


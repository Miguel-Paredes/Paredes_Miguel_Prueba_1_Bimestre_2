import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Prueba_Bimestre_II {
    private JLabel estudiantes;
    private JPanel JPanel;
    private JLabel codigo;
    private JLabel cedula;
    private JLabel nombre;
    private JLabel apellido;
    private JLabel signo;
    private JTextField es_cod;
    private JTextField es_ced;
    private JTextField es_nom;
    private JTextField es_apel;
    private JLabel nacimiento;
    private JLabel color;
    private JLabel casado;
    private JCheckBox rojo;
    private JCheckBox verde;
    private JComboBox anio;
    private JCheckBox niguno;
    private JComboBox mes;
    private JComboBox dia;
    private JRadioButton si;
    private JRadioButton no;
    private JComboBox zigno;
    private JButton cargar;
    private JButton guardar;
    private JButton siguiente;
    private JButton anterior;

    public static void main(String[] args) {
        /*JFrame frame = new JFrame("Prueba_Bimestre_II");
        frame.setContentPane(new Prueba_Bimestre_II().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);*/
        String filePath="data.dat";
        estudiantes alumno = new estudiantes(202121519,1726744327,"Miguel","Paredes","Libra","2003","10","18","rojo","no");
        try (FileOutputStream fileOut=new FileOutputStream(filePath);
             ObjectOutputStream obOut=new ObjectOutputStream(fileOut);){
            obOut.writeObject(alumno);
            System.out.println("archivo escrito correctamente");}

        catch(IOException e){
            throw new RuntimeException(e);}

        try(FileInputStream fileIn=new FileInputStream(filePath);
            ObjectInputStream objIn= new ObjectInputStream(fileIn);){
            estudiantes readObject=(estudiantes) objIn.readObject();
            System.out.println("El objeto en disco es: \n"+readObject);}

        catch(IOException e){
            throw new RuntimeException(e);}

        catch (ClassNotFoundException e){
            throw new RuntimeException();}
    }
}

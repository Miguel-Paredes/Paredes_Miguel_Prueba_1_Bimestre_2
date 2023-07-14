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

    public Prueba_Bimestre_II() {
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Prueba_Bimestre_II formulario = new Prueba_Bimestre_II();
                String filePath="data.dat";
                estudiantes alumno = new estudiantes(formulario.es_ced.getWidth(),
                        formulario.es_ced.getColumns(),
                        formulario.es_nom.getText(),
                        formulario.es_apel.getText(),
                        formulario.zigno.getActionCommand(),
                        formulario.anio.getActionCommand(),
                        formulario.mes.getActionCommand(),
                        formulario.dia.getActionCommand(),
                        formulario.rojo.getText(),
                        formulario.verde.getText(),
                        formulario.niguno.getText(),
                        formulario.si.getText(),
                        formulario.no.getText());
                try (FileOutputStream fileOut=new FileOutputStream(filePath);
                     ObjectOutputStream obOut=new ObjectOutputStream(fileOut);){
                    obOut.writeObject(alumno);
                    System.out.println("archivo escrito correctamente");}

                catch(IOException a){
                    throw new RuntimeException(a);}
            }
        });
        cargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Prueba_Bimestre_II formulario = new Prueba_Bimestre_II();
                String filePath="data.dat";
                estudiantes alumno = new estudiantes(formulario.es_ced.getWidth(),
                        formulario.es_ced.getColumns(),
                        formulario.es_nom.getText(),
                        formulario.es_apel.getText(),
                        formulario.zigno.getActionCommand(),
                        formulario.anio.getActionCommand(),
                        formulario.mes.getActionCommand(),
                        formulario.dia.getActionCommand(),
                        formulario.rojo.getText(),
                        formulario.verde.getText(),
                        formulario.niguno.getText(),
                        formulario.si.getText(),
                        formulario.no.getText());
                try(FileInputStream fileIn=new FileInputStream(filePath);
                    ObjectInputStream objIn= new ObjectInputStream(fileIn);){
                    estudiantes readObject=(estudiantes) objIn.readObject();
                    System.out.println("El objeto en disco es: \n"+readObject);}

                catch(IOException a){
                    throw new RuntimeException(a);}

                catch (ClassNotFoundException a){
                    throw new RuntimeException();}
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Prueba_Bimestre_II");
        Prueba_Bimestre_II formulario = new Prueba_Bimestre_II();
        frame.setContentPane(new Prueba_Bimestre_II().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        /*String filePath="data.dat";
        estudiantes alumno = new estudiantes(formulario.es_ced.getWidth(),
                                             formulario.es_ced.getColumns(),
                                             formulario.es_nom.getText(),
                                             formulario.es_apel.getText(),
                                             formulario.zigno.getActionCommand(),
                                             formulario.anio.getActionCommand(),
                                             formulario.mes.getActionCommand(),
                                             formulario.dia.getActionCommand(),
                                             formulario.rojo.getText(),
                                             formulario.verde.getText(),
                                             formulario.niguno.getText(),
                                             formulario.si.getText(),
                                             formulario.no.getText());
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
*/
    }


}


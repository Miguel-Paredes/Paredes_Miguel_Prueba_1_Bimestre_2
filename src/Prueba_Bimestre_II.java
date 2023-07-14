import javax.swing.*;

public class Prueba_Bimestre_II {
    private JLabel estudiantes;
    private JPanel Jpanel;
    private JLabel codigo;
    private JLabel cedula;
    private JLabel nombre;
    private JLabel apellido;
    private JLabel signo;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel nacimiento;
    private JLabel color;
    private JLabel casado;
    private JCheckBox rojo;
    private JCheckBox verde;
    private JComboBox año;
    private JCheckBox niguno;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JRadioButton si;
    private JRadioButton no;
    private JComboBox zigno;
    private JButton cargar;
    private JButton guardar;
    private JButton siguiente;
    private JButton anterior;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Prueba_Bimestre_II");
        frame.setContentPane(new Prueba_Bimestre_II().Jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

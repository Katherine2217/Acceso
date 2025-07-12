import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ingreso extends JFrame{
    private JPanel Ingreso;
    private JTextField textuser;
    private JPasswordField passwordField1;
    private JButton accesoButton;
    private JButton limpiarButton;
    private JPanel Acceso;
    private JLabel password;
    private JLabel user;

    //

        public Ingreso() {
            setTitle("LOGIN");
            setContentPane(Acceso);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(350, 200);
            setLocationRelativeTo(null);
            setVisible(true);

            accesoButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String usuarioIngresado = textuser.getText();
                    String contraseñaIngresada = new String(passwordField1.getPassword());

                    if (usuarioIngresado.equals("CENESTUR") && contraseñaIngresada.equals("C1234")) {
                        JOptionPane.showMessageDialog(null, "Acceso permitido");
                    } else {
                        JOptionPane.showMessageDialog(null, "Acceso denegado");
                    }
                }
            });

            limpiarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textuser.setText("");
                    passwordField1.setText("");
                }
            });
        }

        public static void main(String[] args) {
            new Ingreso();
        }
    }



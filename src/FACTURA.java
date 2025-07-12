import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FACTURA extends JFrame{
    private JPanel Practica3;
    private JPanel Factura;
    private JTextField textcodigo;
    private JTextField textproduct;
    private JTextField textcantidad;
    private JTextField textprecio;
    private JLabel factura;
    private JTextField textsubtotal;
    private JButton calcularButton;
    private JTextField texttotal;
    private JLabel IVA;
    private JLabel Subtotal;
    private JLabel Total;

        public FACTURA() {
            setTitle("Factura");
            setContentPane(Practica3);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(400, 400);
            setLocationRelativeTo(null); // Centrar la ventana

            // Personalizar fuentes grandes para los labels
            Subtotal.setFont(new Font("Arial", Font.BOLD, 16));
            IVA.setFont(new Font("Arial", Font.BOLD, 16));
            Total.setFont(new Font("Arial", Font.BOLD, 18));

            calcularButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        double precio = Double.parseDouble(textprecio.getText());
                        int cantidad = Integer.parseInt(textcantidad.getText());

                        double subtotal = precio * cantidad;
                        double iva = subtotal * 0.15;
                        double total = subtotal + iva;

                        // Mostrar resultados
                        textsubtotal.setText(String.format("%.2f", subtotal));
                        IVA.setText("IVA (15%): $" + String.format("%.2f", iva));
                        Total.setText("TOTAL A PAGAR: $" + String.format("%.2f", total));
                        texttotal.setText(String.format("%.2f", total));

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos en Precio y Cantidad.");
                    }
                }
            });
        }

        public static void main(String[] args) {
            new FACTURA().setVisible(true);
        }
    }



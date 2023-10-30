import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextField txtTexto;
    private JButton btnBalanceo;
    Pila p= new Pila();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ventana() {

        btnBalanceo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt=txtTexto.getText();
                if (p.balancearTexto(txt,p.pilaDeApertura,p.pilaDeCierre)){JOptionPane.showMessageDialog(null,"FUNCION CORRECTAMENTE BALANCEADA");}else {JOptionPane.showMessageDialog(null,"FUNCION ERRONEAMENTE BALANCEADA");};
            }
        });

        }
    }

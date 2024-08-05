import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EsferaGUI {
    private JFrame frame;
    private JTextField pesoEsferaA;
    private JTextField pesoEsferaB;
    private JTextField pesoEsferaC;
    private JLabel resultadoLabel;

    public EsferaGUI() {
        frame = new JFrame("Determinar Esfera Más Pesada");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));

        JLabel labelA = new JLabel("Peso Esfera A:");
        pesoEsferaA = new JTextField();
        JLabel labelB = new JLabel("Peso Esfera B:");
        pesoEsferaB = new JTextField();
        JLabel labelC = new JLabel("Peso Esfera C:");
        pesoEsferaC = new JTextField();
        JButton calcularButton = new JButton("Calcular");
        resultadoLabel = new JLabel("");

        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double pesoA = Double.parseDouble(pesoEsferaA.getText());
                    double pesoB = Double.parseDouble(pesoEsferaB.getText());
                    double pesoC = Double.parseDouble(pesoEsferaC.getText());

                    if (pesoA > pesoB && pesoA > pesoC) {
                        resultadoLabel.setText("La esfera A es la más pesada.");
                    } else if (pesoB > pesoA && pesoB > pesoC) {
                        resultadoLabel.setText("La esfera B es la más pesada.");
                    } else if (pesoC > pesoA && pesoC > pesoB) {
                        resultadoLabel.setText("La esfera C es la más pesada.");
                    } else {
                        resultadoLabel.setText("Las esferas tienen el mismo peso.");
                    }
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Ingresa valores numéricos válidos.");
                }
            }
        });

        frame.add(labelA);
        frame.add(pesoEsferaA);
        frame.add(labelB);
        frame.add(pesoEsferaB);
        frame.add(labelC);
        frame.add(pesoEsferaC);
        frame.add(calcularButton);
        frame.add(resultadoLabel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EsferaGUI());
    }
}

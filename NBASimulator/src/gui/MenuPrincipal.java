package gui;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame {
    public MenuPrincipal() {
        setTitle("Menú Principal");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("src/resources/nba_icon.png").getImage());

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(25, 25, 112)); // Azul oscuro

        JLabel titulo = new JLabel("Selecciona una opción");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        panel.add(titulo, BorderLayout.NORTH);

        JPanel botones = new JPanel(new GridLayout(3, 1, 15, 15));
        botones.setBackground(new Color(25, 25, 112));
        botones.setBorder(BorderFactory.createEmptyBorder(40, 100, 40, 100));

        String[] textos = {"Ver Equipos", "Simular Jornadas", "Simular Playoffs"};
        JButton[] botonesArray = new JButton[3];

        for (int i = 0; i < textos.length; i++) {
            botonesArray[i] = new JButton(textos[i]);
            botonesArray[i].setFont(new Font("Arial", Font.BOLD, 16));
            botonesArray[i].setBackground(Color.RED);
            botonesArray[i].setForeground(Color.WHITE);
            botonesArray[i].setFocusPainted(false);
            botonesArray[i].setPreferredSize(new Dimension(200, 50));
            botones.add(botonesArray[i]);
        }

        botonesArray[0].addActionListener(e -> new EquiposFrame());
        botonesArray[1].addActionListener(e -> new SimulacionFrame());
        botonesArray[2].addActionListener(e -> new PlayoffsFrame());

        panel.add(botones, BorderLayout.CENTER);
        add(panel);
        setVisible(true);
    }
}

package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioFrame extends JFrame {
    public InicioFrame() {
        setTitle("NBA Simulator");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("src/resources/nba_icon.png").getImage());

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.BLACK);

        JLabel titulo = new JLabel("NBA SEASON SIMULATOR");
        titulo.setFont(new Font("Arial", Font.BOLD, 26));
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));

        JLabel logo = new JLabel(new ImageIcon("src/resources/nba_logo.png"));
        logo.setHorizontalAlignment(JLabel.CENTER);

        JButton btnEntrar = new JButton("ENTRAR");
        btnEntrar.setFont(new Font("Arial", Font.BOLD, 16));
        btnEntrar.setBackground(Color.RED);
        btnEntrar.setForeground(Color.WHITE);
        btnEntrar.setFocusPainted(false);
        btnEntrar.setPreferredSize(new Dimension(120, 40));

        btnEntrar.addActionListener(e -> {
            dispose();
            new MenuPrincipal();
        });

        JPanel abajo = new JPanel();
        abajo.setBackground(Color.BLACK);
        abajo.add(btnEntrar);

        panel.add(titulo, BorderLayout.NORTH);
        panel.add(logo, BorderLayout.CENTER);
        panel.add(abajo, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new InicioFrame();
    }
}

package NBASimulator;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioFrame extends JFrame 
{
    public InicioFrame() 
    {
        setTitle("NBA Simulator");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        // Panel con imagen de fondo
        JPanel panelConFondo = new JPanel() 
        {
            private Image imagen = new ImageIcon(getClass().getResource("/NBASimulator/nba_logo.png")).getImage();
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        
     // Crear JLabel para el título
        JLabel titulo = new JLabel("NBA SEASON SIMULATOR");
        titulo.setFont(new Font("Arial", Font.BOLD, 26));
        titulo.setForeground(Color.BLUE);     // Letras azules
        titulo.setBackground(Color.RED);      // Fondo rojo
        titulo.setOpaque(true);               // Muy importante para que el fondo se vea
        titulo.setBackground(new Color(0, 0, 0, 150)); // Fondo negro translúcido
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Márgenes interiores


        // Crear panel contenedor del título y alinearlo a la izquierda
        JPanel panelTitulo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelTitulo.setOpaque(false); // Para que sea transparente sobre el fondo
        panelTitulo.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 0)); // Margen arriba/izquierda
        panelTitulo.add(titulo);


        JButton btnEntrar = new JButton("ENTRAR");
        btnEntrar.setFont(new Font("Arial", Font.BOLD, 16));
        btnEntrar.setBackground(Color.RED);
        btnEntrar.setForeground(Color.WHITE);
        btnEntrar.setFocusPainted(false);
        btnEntrar.setPreferredSize(new Dimension(120, 40));

        btnEntrar.addActionListener(e -> 
        {
            dispose();
            new MenuPrincipal();
        });

        JPanel abajo = new JPanel();
        abajo.setBackground(Color.BLACK);
        abajo.add(btnEntrar);

        panelConFondo.add(titulo, BorderLayout.NORTH);
       
        panelConFondo.add(abajo, BorderLayout.SOUTH);

        add(panelConFondo);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new InicioFrame();
    }
}

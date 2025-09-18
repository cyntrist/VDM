package com.sol.desktop;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

// java.swing.JFrame (Crea nuestra ventana)
// java.awt.Button (Componente que representa un botón)
// java.awt.TextField (Componente que representa texto)
// java.awt.event.MouseListener (Nos permite escuchar los eventos de ratón

public class MyClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Desktop");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        TextField field = new TextField("Hello World!");
        Button button = new Button("Send");
        frame.add(field);
        frame.add(button);

        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                JOptionPane.showMessageDialog(null, field.getText());
                //window es el JFrame y text será el texto que queremos que se muestre.
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        };
        button.addMouseListener(ml);
    }

    public void buttonPressed(MouseEvent e) {

    }
}
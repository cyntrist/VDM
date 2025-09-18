package com.sol.canvas_desktop;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.naming.Context;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

public class CanvasDesktopMain {
    public static void main(String[] args) {
        // ventana
        JFrame frame = new JFrame("Canvas Desktop");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // elementos
        Button clearButton = new Button("Clear");
        Button drawButton = new Button("Draw");
        frame.add(clearButton);
        frame.add(drawButton);

        // canvas
        Canvas canvas = new Canvas();
        canvas.setSize(400,400);
        canvas.setBackground(Color.white);
        canvas.setVisible(true);
        frame.add(canvas);
        frame.setVisible(true);

        frame.createBufferStrategy(2);
        BufferStrategy bf = frame.getBufferStrategy();
        Graphics2D g = (Graphics2D) canvas.getGraphics();
        g.setColor(Color.black);
        g.fillRect(5, 5, 30, 30);
        bf.show();

        int diameter = 80;
        int width = canvas.getWidth();
        int height = canvas.getHeight();

        // interacción botones
        MouseListener clearML = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                g.clearRect(0, 0, width, height);
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        };
        MouseListener drawML = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                g.fillOval(width/2 - diameter/2, height/2 - diameter/2, diameter, diameter);
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        };
        clearButton.addMouseListener(clearML);
        drawButton.addMouseListener(drawML);


        while (true) {
            //g.fillOval(width/2 - diameter/2, height/2 - diameter/2, diameter, diameter);
            bf.show();
        }
    }
}
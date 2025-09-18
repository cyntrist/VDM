package com.sol.canvas_desktop;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import java.awt.Canvas;
import java.awt.Graphics2D;

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

        // canvas
        Canvas canvas = new Canvas();
        canvas.setSize(400,400);
        frame.add(canvas);
        canvas.setVisible(true);
        frame.setVisible(true);

        Graphics2D g = (Graphics2D) canvas.getGraphics();
        g.setColor(Color.black);
        g.fillRect(100, 30, 30, 30);
        canvas.paint(g);
    }
}
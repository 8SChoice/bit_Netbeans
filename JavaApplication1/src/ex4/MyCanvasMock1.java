package ex4;



import java.awt.Canvas;

import java.awt.Color;

import java.awt.Graphics;

import javax.swing.JFrame;



/* MyCanVasMock */

public class MyCanvasMock1 extends JFrame{

    private int arcNum=360;

    private int x,y;

    public MyCanvasMock1() {

        Canvas can = new Canvas(){

            @Override

            public void update(Graphics g) {

                paint(g);

            }

            @Override

            public void paint(Graphics g) {

                g.drawArc(x, y, 100, 100, 0, arcNum);

            }

        };

        add(can);

        can.setBackground(Color.yellow);

        setBounds(100, 100, 300, 300);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

    }

    public static void main(String[] args) {

        new MyCanvasMock1();

    }

}

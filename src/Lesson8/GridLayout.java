package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayout {

    static public class PlayWindow extends JFrame {
        public PlayWindow() {
            initComponents();

            setTitle("TicTacToe");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(500, 500);
            setLocationRelativeTo(null);

            JButton[] jbs = new JButton[25];
//            jbs.addActionListener(new ActionListener() {
//                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("");
                }
//            });

            setLayout(new java.awt.GridLayout(5,5));
            for (int i = 0; i < jbs.length; i++) {
                jbs[i] = new JButton(" ");
                add(jbs[i]);
            }



            setVisible(true);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PlayWindow();
            }
        });

//        prepareGame();
//        playGame();
//        System.out.println("Игра окончена!");

        }
}

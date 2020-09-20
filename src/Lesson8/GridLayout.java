package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Lesson8.PlayTicTacToe.playGame;
import static Lesson8.PlayTicTacToe.prepareGame;

public class GridLayout {

    protected static final char DOT_EMPTY = '•';
    protected static final char DOT_X = 'X';
    protected static final char DOT_O = 'O';

    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    static public class PlayWindow extends JFrame {
        public PlayWindow() {

            setTitle("TicTacToe");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(500, 500);
            setLocationRelativeTo(null);

            JButton[] jbs = new JButton[25];
            setLayout(new java.awt.GridLayout(5,5));
            for (int i = 0; i < jbs.length; i++) {
                jbs[i] = new JButton(" ");
                add(jbs[i]);
                jbs[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " ");
                    }
                });

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


    }
}
